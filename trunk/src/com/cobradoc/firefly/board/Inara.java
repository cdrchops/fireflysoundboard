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
public class Inara extends Soundboard {

	public Inara() {
		super("Inara");
		initialize();
	}

	private void initialize() {
        addSample("You'll be fine", R.raw.fine);
    }
}