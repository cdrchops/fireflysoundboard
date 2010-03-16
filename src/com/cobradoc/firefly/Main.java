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
        mSoundManager.addSound(1, R.raw.alarm);
        mSoundManager.addSound(2, R.raw.away);
        mSoundManager.addSound(3, R.raw.badidea);
        mSoundManager.addSound(4, R.raw.boat);
        mSoundManager.addSound(5, R.raw.bountyhunter);
        mSoundManager.addSound(6, R.raw.browmop);
        mSoundManager.addSound(7, R.raw.bugs);
        mSoundManager.addSound(8, R.raw.care);
        mSoundManager.addSound(9, R.raw.cheerful);
        mSoundManager.addSound(10, R.raw.child);
        mSoundManager.addSound(11, R.raw.crowded);
        mSoundManager.addSound(12, R.raw.early);
        mSoundManager.addSound(13, R.raw.fault);
        mSoundManager.addSound(14, R.raw.feel);
        mSoundManager.addSound(15, R.raw.fine);
        mSoundManager.addSound(16, R.raw.fuzzy);
        mSoundManager.addSound(17, R.raw.guns);
        mSoundManager.addSound(18, R.raw.hereiam);
        mSoundManager.addSound(19, R.raw.heroes);
        mSoundManager.addSound(20, R.raw.insane);
        mSoundManager.addSound(21, R.raw.jail);
        mSoundManager.addSound(22, R.raw.job);
        mSoundManager.addSound(23, R.raw.kidnap);
        mSoundManager.addSound(24, R.raw.knife);
        mSoundManager.addSound(25, R.raw.lion);
        mSoundManager.addSound(26, R.raw.midget);
        mSoundManager.addSound(27, R.raw.mind);
        mSoundManager.addSound(28, R.raw.nothing);
        mSoundManager.addSound(29, R.raw.object);
        mSoundManager.addSound(30, R.raw.pretty);
        mSoundManager.addSound(31, R.raw.putyou);
        mSoundManager.addSound(32, R.raw.rightmove);
        mSoundManager.addSound(33, R.raw.saintjayne);
        mSoundManager.addSound(34, R.raw.scare);
        mSoundManager.addSound(35, R.raw.serenity);
        mSoundManager.addSound(36, R.raw.shiny);
        mSoundManager.addSound(37, R.raw.ship);
        mSoundManager.addSound(38, R.raw.something);
        mSoundManager.addSound(39, R.raw.soup);
        mSoundManager.addSound(40, R.raw.spaceship);
        mSoundManager.addSound(41, R.raw.speech);
        mSoundManager.addSound(42, R.raw.steak);
        mSoundManager.addSound(43, R.raw.theme);
        mSoundManager.addSound(44, R.raw.thinking);
        mSoundManager.addSound(45, R.raw.way);
        mSoundManager.addSound(46, R.raw.witch);
        mSoundManager.addSound(47, R.raw.workwork);
        mSoundManager.addSound(48, R.raw.worry);

        createButton(1, R.id.washAlarm);
        createButton(2, R.id.jubalAway);
        createButton(3, R.id.badIdeasound);
        createButton(4, R.id.boatsound);
        createButton(5, R.id.bountyhuntersound);
        createButton(6, R.id.browmopa);
        createButton(6, R.id.bugsa);
        createButton(8, R.id.carea);
        createButton(9, R.id.cheerfula);
        createButton(10, R.id.childa);
        createButton(11, R.id.crowdeda);
        createButton(12, R.id.earlya);
        createButton(13, R.id.faulta);
        createButton(14, R.id.feela);
        createButton(15, R.id.finea);
        createButton(16, R.id.fuzzya);
        createButton(17, R.id.gunsa);
        createButton(18, R.id.hereiama);
        createButton(19, R.id.heroesa);
        createButton(20, R.id.insanea);
        createButton(21, R.id.jaila);
        createButton(22, R.id.joba);
        createButton(23, R.id.kidnapa);
        createButton(24, R.id.knifea);
        createButton(25, R.id.liona);
        createButton(26, R.id.midgeta);
        createButton(27, R.id.minda);
        createButton(28, R.id.nothinga);
        createButton(29, R.id.objecta);
        createButton(30, R.id.prettya);
        createButton(31, R.id.putyoua);
        createButton(32, R.id.rightmovea);
        createButton(33, R.id.saintjaynea);
        createButton(34, R.id.scarea);
        createButton(35, R.id.serenitya);
        createButton(36, R.id.shinya);
        createButton(37, R.id.shipa);
        createButton(38, R.id.somethinga);
        createButton(39, R.id.soupa);
        createButton(40, R.id.spaceshipa);
        createButton(41, R.id.speecha);
        createButton(42, R.id.steaka);
        createButton(43, R.id.themea);
        createButton(44, R.id.thinkinga);
        createButton(45, R.id.waya);
        createButton(46, R.id.witcha);
        createButton(47, R.id.workworka);
        createButton(48, R.id.worrya);
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