/**
 * $Id$
 * $Copyright$
 */
package com.cobradoc.firefly;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import com.cobradoc.firefly.board.*;

/**
 * @author torr
 * @since Mar 19, 2010 - 11:41:32 AM
 */
public class BaseLayout extends Activity {
    private MediaPlayer player;
    protected static int playerValue = R.id.AllSoundsMenu;

    protected void createGrid(final Soundboard clazz) {
        createGrid(R.id.Mal, clazz);
    }

    protected void createGrid(final int id, final Soundboard clazz) {
        final GridView miscGrid = (GridView) findViewById(id);
        miscGrid.setAdapter(new SoundboardAdapter(this, clazz));
    }

    public void prepare(final Sample sample) {
//		 Do nothing at the moment.
    }

    public void play(final Sample sample) {
        Log.v(getClass().getName(), "Playing: " + sample.getName() + " (" + sample.getResId() + ")");

        stop();

        player = MediaPlayer.create(this, sample.getResId());
        player.setVolume(2.0f, 2.0f);

        if (player != null) {
            player.start();
        }
    }

    public void stop() {
        if (player != null) {
            player.stop();
            player.release();
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

        if (Settings.isTabbedLayout) {
            final MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.layout.menu_tabs, menu);
        } else {
            final MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.layout.menu, menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        return selection(item.getItemId());
    }

    protected boolean selection(final int id) {
        switch (id) {
            case R.id.about:
                startActivity(new Intent(this, About.class));
                return true;
            case R.id.quit:
                finish();
                return true;
            case R.id.AllSoundsMenu:
                playerValue = R.id.AllSoundsMenu;
                createGrid(new AllSounds());
                return true;
            case R.id.settings:
                startActivity(new Intent(this, Settings.class));
                return true;
            case R.id.MalMenu:
                playerValue = R.id.MalMenu;
                createGrid(new Mal());
                return true;
            case R.id.ZoeMenu:
                playerValue = R.id.ZoeMenu;
                createGrid(new Zoe());
                return true;
            case R.id.JubalEarlyMenu:
                playerValue = R.id.JubalEarlyMenu;
                createGrid(new JubalEarly());
                return true;
            case R.id.JayneMenu:
                playerValue = R.id.JayneMenu;
                createGrid(new Jayne());
                return true;
            case R.id.WashMenu:
                playerValue = R.id.WashMenu;
                createGrid(new Wash());
                return true;
            case R.id.KayleeMenu:
                playerValue = R.id.KayleeMenu;
                createGrid(new Kaylee());
                return true;
            case R.id.RiverMenu:
                playerValue = R.id.RiverMenu;
                createGrid(new River());
                return true;
            case R.id.SimonMenu:
                playerValue = R.id.SimonMenu;
                createGrid(new Simon());
                return true;
            case R.id.BookMenu:
                playerValue = R.id.BookMenu;
                createGrid(new Book());
                return true;
            //         case R.id.MrUniverseMenu:
//            playerValue = R.id.MrUniverseMenu;
            //            createGrid(new MrUniverse());
            //             return true;
            case R.id.InaraMenu:
                playerValue = R.id.InaraMenu;
                createGrid(new Inara());
                return true;
            case R.id.MiscMenu:
                playerValue = R.id.MiscMenu;
                createGrid(new Misc());
                return true;
            //         case R.id.TheOperativeMenu:
//            playerValue = R.id.TheOperativeMenu;
            //            createGrid(new TheOperative());
            //             return true;
        }

        return false;
    }
}
