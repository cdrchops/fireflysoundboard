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
public class Kaylee extends Soundboard {

	public Kaylee() {
		super("Kaylee");
		initialize();
	}

	private void initialize() {
        addSample("Spacebugs", R.raw.bugs);
        addSample("A-Ok", R.raw.shiny);
    }

}