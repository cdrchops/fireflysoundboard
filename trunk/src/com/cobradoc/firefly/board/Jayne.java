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
public class Jayne extends Soundboard {

	public Jayne() {
		super("Jayne Cobb");
		initialize();
	}

	private void initialize() {
        addSample("Kaylee cheerful", R.raw.cheerful);
        addSample("Not Jaynes fault", R.raw.fault);
        addSample("can't get paid if you're dead", R.raw.nothing);
        addSample("Saint Jayne", R.raw.saintjayne);
        addSample("don't like people hearin what I'm thinkin", R.raw.thinking);
        addSample("She's a witch", R.raw.witch);
    }
}