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
public class Zoe extends Soundboard {

	public Zoe() {
		super("Zoe");
		initialize();
	}

	private void initialize() {
        addSample("We should be in Jail", R.raw.jail);
        addSample("wacky fun", R.raw.knife);
        addSample("work work work", R.raw.workwork);
    }

}