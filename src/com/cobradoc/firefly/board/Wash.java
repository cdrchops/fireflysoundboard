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
public class Wash extends Soundboard {

	public Wash() {
		super("Hoban Washburn");
		initialize();
	}

	private void initialize() {
        addSample("we're being followed", R.raw.alarm);
        addSample("brow mopper", R.raw.browmop);
        addSample("Here's something you can't do", R.raw.something);
        addSample("The soup thing", R.raw.soup);
        addSample("We live in a spaceship", R.raw.spaceship);
        addSample("How did your brain learn speech", R.raw.speech);
    }

}