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
