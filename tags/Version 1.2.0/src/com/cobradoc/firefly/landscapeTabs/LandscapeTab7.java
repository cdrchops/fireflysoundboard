/**
 * $Id$
 * $Copyright$
 */
package com.cobradoc.firefly.landscapeTabs;

import com.cobradoc.firefly.R;
import com.cobradoc.firefly.Soundboard;

/**
 * @author torr
 * @since Mar 29, 2010 - 12:28:40 PM
 */
public class LandscapeTab7 extends Soundboard {
    public LandscapeTab7() {
        super("Tab");
    }

    public void initialize() {
        addSample("Complete This Land", R.raw.thislandcomplete);
        addSample("We shall call this land", R.raw.thisland);
        addSample("inevitable betrayal", R.raw.betrayal);
        addSample("aim to misbehave", R.raw.aimtomisbehave);
        addSample("I'll be in my bunk", R.raw.inmybunk);
    }
}
