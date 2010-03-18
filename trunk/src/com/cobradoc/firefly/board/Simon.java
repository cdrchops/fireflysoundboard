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
public class Simon extends Soundboard {

	public Simon() {
		super("Simon Tamm");
		initialize();
	}

	private void initialize() {
        addSample("He's gentle and fuzzy", R.raw.fuzzy);
        addSample("The nice man wants to kidnap you", R.raw.kidnap);
        addSample("You're out of your mind", R.raw.mind);
        addSample("River is Serenity", R.raw.serenity);
        addSample("get in a mans way", R.raw.way);
        addSample("don't worry about me", R.raw.worry);
    }
}