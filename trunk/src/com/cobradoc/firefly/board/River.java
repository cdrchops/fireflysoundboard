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
public class River extends Soundboard {

	public River() {
		super("River Tamm");
		initialize();
	}

	private void initialize() {
        addSample("very crowded", R.raw.crowded);
        addSample("You got issues", R.raw.early);
        addSample("It's just an object", R.raw.object);
    }

}