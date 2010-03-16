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

        createButton(1, R.id.washAlarm);
        createButton(2, R.id.jubalAway);
        createButton(3, R.id.badIdeasound);
        createButton(4, R.id.boatsound);
        createButton(5, R.id.bountyhuntersound);
        createButton(6, R.id.browmopa);
    }

    private void createButton(final int soundNumber, final int viewId) {
        final Button soundButton = (Button) findViewById(viewId);
        soundButton.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		mSoundManager.playSound(soundNumber);
        	}
        });
    }
}