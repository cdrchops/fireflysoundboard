/**
 * $Id$
 * $Copyright$
 */
package com.cobradoc.firefly;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author torr
 * @since Mar 16, 2010 - 10:05:19 AM
 */
public class Main extends Activity {
    private SoundManager mSoundManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mSoundManager = new SoundManager();
        mSoundManager.initSounds(getBaseContext());

        addSound(1, R.raw.alarm, R.id.alarma);
        addSound(2, R.raw.away, R.id.awaya);
        addSound(3, R.raw.badidea, R.id.badideaa);
        addSound(4, R.raw.boat, R.id.boata);
        addSound(5, R.raw.bountyhunter, R.id.bountyhuntera);
        addSound(6, R.raw.browmop, R.id.browmopa);
        addSound(7, R.raw.bugs, R.id.bugsa);
        addSound(8, R.raw.care, R.id.carea);
        addSound(9, R.raw.cheerful, R.id.cheerfula);
        addSound(10, R.raw.child, R.id.childa);
        addSound(11, R.raw.crowded, R.id.crowdeda);
        addSound(12, R.raw.early, R.id.earlya);
        addSound(13, R.raw.fault, R.id.faulta);
        addSound(14, R.raw.feel, R.id.feela);
        addSound(15, R.raw.fine, R.id.finea);
        addSound(16, R.raw.fuzzy, R.id.fuzzya);
        addSound(17, R.raw.guns, R.id.gunsa);
        addSound(18, R.raw.hereiam, R.id.hereiama);
        addSound(19, R.raw.heroes, R.id.heroesa);
        addSound(20, R.raw.insane, R.id.insanea);
        addSound(21, R.raw.jail, R.id.jaila);
        addSound(22, R.raw.job, R.id.joba);
        addSound(23, R.raw.kidnap, R.id.kidnapa);
        addSound(24, R.raw.knife, R.id.knifea);
        addSound(25, R.raw.lion, R.id.liona);
        addSound(26, R.raw.midget, R.id.midgeta);
        addSound(27, R.raw.mind, R.id.minda);
        addSound(28, R.raw.nothing, R.id.nothinga);
        addSound(29, R.raw.object, R.id.objecta);
        addSound(30, R.raw.pretty, R.id.prettya);
        addSound(31, R.raw.putyou, R.id.putyoua);
        addSound(32, R.raw.rightmove, R.id.rightmovea);
        addSound(33, R.raw.saintjayne, R.id.saintjaynea);
        addSound(34, R.raw.scare, R.id.scarea);
        addSound(35, R.raw.serenity, R.id.serenitya);
        addSound(36, R.raw.shiny, R.id.shinya);
        addSound(37, R.raw.ship, R.id.shipa);
        addSound(38, R.raw.something, R.id.somethinga);
        addSound(39, R.raw.soup, R.id.soupa);
        addSound(40, R.raw.spaceship, R.id.spaceshipa);
        addSound(41, R.raw.speech, R.id.speecha);
        addSound(42, R.raw.steak, R.id.steaka);
        addSound(43, R.raw.theme, R.id.themea);
        addSound(44, R.raw.thinking, R.id.thinkinga);
        addSound(45, R.raw.way, R.id.waya);
        addSound(46, R.raw.witch, R.id.witcha);
        addSound(47, R.raw.workwork, R.id.workworka);
        addSound(48, R.raw.worry, R.id.worrya);
    }

    private void addSound(final int soundNumber, int rawNumber, int viewId) {
        mSoundManager.addSound(soundNumber, rawNumber);
        createButton(soundNumber, viewId);
    }

    private void createButton(final int soundNumber, final int viewId) {
        final Button soundButton = (Button) findViewById(viewId);
        soundButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
                mSoundManager.stopAll();
        		mSoundManager.playSound(soundNumber);
        	}
        });
    }
}