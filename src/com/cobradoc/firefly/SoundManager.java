package com.cobradoc.firefly;

import java.util.HashMap;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;

public class SoundManager {
	private static final SoundPool mSoundPool = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
	private static final HashMap<Integer, Integer> mSoundPoolMap = new HashMap<Integer, Integer>();
	private AudioManager mAudioManager;
	private Context mContext;
    private static int streamVolume;

	public void initSounds(final Context theContext) {
		 mContext = theContext;
	     mAudioManager = (AudioManager) mContext.getSystemService(Context.AUDIO_SERVICE);
         streamVolume = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
	}

	public void addSound(final int index, final int soundid) {
		mSoundPoolMap.put(index, mSoundPool.load(mContext, soundid, 1));
	}

	public void playSound(final int index) {
	     mSoundPool.play(mSoundPoolMap.get(index), streamVolume, streamVolume, 1, 0, 1f);
	}

	public void playLoopedSound(final int index) {
	     mSoundPool.play(mSoundPoolMap.get(index), streamVolume, streamVolume, 1, -1, 1f);
	}

    public void stopAll() {
        for (final Integer inter : mSoundPoolMap.keySet()) {
            mSoundPool.stop(mSoundPoolMap.get(inter));
        }
    }
}