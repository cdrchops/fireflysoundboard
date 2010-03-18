/**
 * $Id$
 * $Copyright$
 */
package com.cobradoc.firefly.board;

import com.cobradoc.firefly.R;
import com.cobradoc.firefly.Soundboard;

/**
 * @author torr
 * @since Mar 17, 2010 - 11:46:37 AM
 */
public class Mal extends Soundboard {

	public Mal() {
		super("Malcom Reynolds");
		initialize();
	}

	private void initialize() {
        addSample("This is a bad idea", R.raw.badidea);
        addSample("No touching guns", R.raw.guns);
        addSample("Big Damn Heroes", R.raw.heroes);
        addSample("Jayne's got a job to do", R.raw.job);
        addSample("We're gonna die", R.raw.pretty);
        addSample("Pain is scary", R.raw.scare);
        addSample("Horses are steak", R.raw.steak);
    }
}