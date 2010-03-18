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

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import com.cobradoc.firefly.board.*;

/**
 * This class and code borrows heavily from the Zappenduster soundboard
 * I was headed in the same direction when I found that code, so I borrowed it
 * I have left the original copyrights for Zappenduster in the code and where applicable
 * added the license for Kaleut Software
 * <p/>
 * The sounds are from http://www.moviesoundclips.net/sound.php?id=70
 *
 * @author StandTrooper
 * @since 16Mar2010
 */
public class FireflySoundboard extends Activity {

    private MediaPlayer player;

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        createGrid(new AllSounds());
    }

    private void createGrid(final Soundboard clazz) {
        final GridView miscGrid = (GridView) findViewById(R.id.Mal);
        miscGrid.setAdapter(new SoundboardAdapter(this, clazz));
    }

    public void prepare(final Sample sample) {
//		 Do nothing at the moment.
    }

    public void play(final Sample sample) {
        Log.v(getClass().getName(), "Playing: " + sample.getName() + " (" + sample.getResId() + ")");

        if (player != null) {
            player.stop();
            player.release();
        }

        player = MediaPlayer.create(this, sample.getResId());
        player.setVolume(2.0f, 2.0f);

        if (player != null) {
            player.start();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (player != null) {
            player.release();
            player = null;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        super.onCreateOptionsMenu(menu);

        final MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.layout.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                startActivity(new Intent(this, About.class));
                return true;
            case R.id.quit:
                finish();
                return true;
            case R.id.AllSoundsMenu:
                createGrid(new AllSounds());
                return true;
            case R.id.MalMenu:
                createGrid(new Mal());
                return true;
            case R.id.ZoeMenu:
                createGrid(new Zoe());
                return true;
            case R.id.JubalEarlyMenu:
                createGrid(new JubalEarly());
                return true;
            case R.id.JayneMenu:
                createGrid(new Jayne());
                return true;
            case R.id.WashMenu:
                createGrid(new Wash());
                return true;
            case R.id.KayleeMenu:
                createGrid(new Kaylee());
                return true;
            case R.id.RiverMenu:
                createGrid(new River());
                return true;
            case R.id.SimonMenu:
                createGrid(new Simon());
                return true;
            case R.id.BookMenu:
                createGrid(new Book());
                return true;
//             case R.id.MrUniverseMenu:
//                createGrid(new MrUniverse());
//                 return true;
            case R.id.InaraMenu:
                createGrid(new Inara());
                return true;
//             case R.id.TheOperativeMenu:
//                createGrid(new TheOperative());
//                 return true;
        }

        return false;
    }

}