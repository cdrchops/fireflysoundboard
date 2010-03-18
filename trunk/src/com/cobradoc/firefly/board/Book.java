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
public class Book extends Soundboard {

	public Book() {
		super("Shepard Book");
		initialize();
	}

	private void initialize() {
        addSample("Half a hump", R.raw.putyou);
    }
}