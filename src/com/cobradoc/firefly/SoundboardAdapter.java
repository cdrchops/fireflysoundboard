/*
 * Zappenduster Soundboard - a soundboard for geeks.
 *
 * Copyright (c) 2009 Adrian Marte
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
/*
 * Firefly Soundboard - a soundboard for Firefly and Serenity.
 *
 * Copyright (c) 2010 Tim Orr aka StandTrooper
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.cobradoc.firefly;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SoundboardAdapter extends BaseAdapter {

    final BaseLayout context;

    final Soundboard board;

    public SoundboardAdapter(final BaseLayout context, final Soundboard board) {
        this.context = context;
        this.board = board;

        prepare(board);
    }

    private void prepare(final Soundboard board) {
        List<Sample> samples = board.getSamples();

        for (Sample sample : samples) {
            context.prepare(sample);
        }
    }

    public int getCount() {
        return board.getSamples().size();
    }

    public Object getItem(final int position) {
        return null;
    }

    public long getItemId(final int position) {
        return 0;
    }

    public View getView(final int position, final View convertView, final ViewGroup parent) {
        try {
            final Sample sample = board.getSamples().get(position);

            if (sample != null) {
                final Button button = new Button(context);
                button.setText(sample.getName());

                button.setOnClickListener(new OnClickListener() {
                    public void onClick(View v) {
                        context.play(sample);
                    }
                });

                button.setOnLongClickListener(new View.OnLongClickListener() {
                    public boolean onLongClick(final View view) {
                        Log.e("soundboard adapter", "pressed the longen clicken");
                        saveas(sample);

                        Toast.makeText(context, Html.fromHtml("You have saved the sound <b>"+ sample.getName() + "</b>"), Toast.LENGTH_LONG).show();
                        return false;
                    }
                });

                button.setLongClickable(true);


                return button;
            }
        } catch (IndexOutOfBoundsException e) {
            Log.e(getClass().getCanonicalName(), "No sample at position " + position);
        }

        return null;
    }

    public void setRingTone(Context context) {
        String LOG_TAG = "";
        try {
            Log.d(LOG_TAG, "setRingTone()");
            String filepath = "/sdcard/schoolbell.mp3";
            File ringtoneFile = new File(filepath);
            Log.d(LOG_TAG, "Starting content puts");
            ContentValues content = new ContentValues();
            content.put(MediaStore.MediaColumns.DATA,
                    ringtoneFile.getAbsolutePath());
            content.put(MediaStore.MediaColumns.TITLE, "schoolbell");
//content.put(MediaStore.MediaColumns.SIZE, 215454);
            content.put(MediaStore.MediaColumns.MIME_TYPE, "audio/mp3");
//content.put(MediaStore.Audio.Media.ARTIST, "Madonna");
//content.put(MediaStore.Audio.Media.DURATION, 230);
            content.put(MediaStore.Audio.Media.IS_RINGTONE, true);
//content.put(MediaStore.Audio.Media.IS_NOTIFICATION, false);
//content.put(MediaStore.Audio.Media.IS_ALARM, false);
//content.put(MediaStore.Audio.Media.IS_MUSIC, false);
            Log.d(LOG_TAG, "Starting database puts");
//Insert it into the database
            Log.i(LOG_TAG, "the absolute path of the fileis :" + ringtoneFile.getAbsolutePath());
            Uri uri = MediaStore.Audio.Media.getContentUriForPath
                    (ringtoneFile.getAbsolutePath());
            Uri newUri = context.getContentResolver().insert(uri, content);
            Uri ringtoneUri = newUri;
            Log.i(LOG_TAG, "1 the ringtone uri is :" + uri);
            Log.i(LOG_TAG, "2 the ringtone uri is :" + ringtoneUri);
            RingtoneManager.setActualDefaultRingtoneUri
                    (context, RingtoneManager.TYPE_RINGTONE, newUri);
        }
        catch (Exception e) {
            Log.e(LOG_TAG, "Error @3:" + e.getMessage());
        }
    }

    public boolean saveas(Sample sample) {
        final int ressound = sample.getResId();
        final String name = sample.getName().replaceAll(" ", "").replaceAll("'","").toLowerCase();
        byte[] buffer = null;
        final InputStream fIn = context.getResources().openRawResource(ressound);
        int size = 0;

        try {
            size = fIn.available();
            buffer = new byte[size];
            fIn.read(buffer);
            fIn.close();
        } catch (IOException e) {
            Log.e("saveas1a", e.getMessage());
            return false;
        }

        String path = "/sdcard/media/audio/ringtones/";
        String filename = name + ".ogg";

        Log.e("saveas1", path + filename);
        final boolean exists = (new File(path)).exists();
        if (!exists) {
            new File(path).mkdirs();
        }

        FileOutputStream save;
        try {
            save = new FileOutputStream(path + filename);
            save.write(buffer);
            save.flush();
            save.close();
        } catch (FileNotFoundException e) {
            Log.e("saveas2", e.getMessage());
            return false;
        } catch (IOException e) {
            Log.e("saveas3", e.getMessage());
            return false;
        }

        context.sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://" + path + filename)));

        final File k = new File(path, filename);

        final ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DATA, k.getAbsolutePath());
        values.put(MediaStore.MediaColumns.TITLE, name);
        values.put(MediaStore.MediaColumns.MIME_TYPE, "audio/ogg");
        values.put(MediaStore.Audio.Media.ARTIST, "Firefly/Serenity");
        values.put(MediaStore.Audio.Media.IS_RINGTONE, true);
        values.put(MediaStore.Audio.Media.IS_NOTIFICATION, true);
        values.put(MediaStore.Audio.Media.IS_ALARM, true);
        values.put(MediaStore.Audio.Media.IS_MUSIC, false);

        //Insert it into the database
        context.getContentResolver().insert(MediaStore.Audio.Media.getContentUriForPath(k.getAbsolutePath()), values);

        return true;
    }
}
