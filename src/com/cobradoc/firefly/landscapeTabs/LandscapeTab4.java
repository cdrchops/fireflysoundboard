/*
 * Firefly Soundboard - a soundboard for Firefly and Serenity.
 *
 * Copyright (c) 2010 Tim Orr aka StandTrooper
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.See the GNU General
 * Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.cobradoc.firefly.landscapeTabs;

import com.cobradoc.firefly.R;
import com.cobradoc.firefly.Soundboard;

/**
 * @author StandTrooper
 * @since Mar 17, 2010 - 11:46:37 AM
 */
public class LandscapeTab4 extends Soundboard {

    public LandscapeTab4() {
        super("Tab");
    }

    public void initialize() {
        addSample("My gorram ship", R.raw.ship);

        //Kaylee
        addSample("Spacebugs", R.raw.bugs);
        addSample("A-Ok", R.raw.shiny);

        //Jayne
        addSample("Kaylee cheerful", R.raw.cheerful);
        addSample("Not Jaynes fault", R.raw.fault);
        addSample("can't get paid if you're dead", R.raw.nothing);
        addSample("Saint Jayne", R.raw.saintjayne);
        addSample("don't like people hearin what I'm thinkin", R.raw.thinking);
    }
}