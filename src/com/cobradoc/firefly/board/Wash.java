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
package com.cobradoc.firefly.board;

import com.cobradoc.firefly.R;
import com.cobradoc.firefly.Soundboard;

/**
 * @author StandTrooper
 * @since Mar 17, 2010 - 11:46:37 AM
 */
public class Wash extends Soundboard {

    public Wash() {
        super("Hoban Washburn");
    }

    public void initialize() {
        addSample("we're being followed", R.raw.alarm);
        addSample("brow mopper", R.raw.browmop);
        addSample("Here's something you can't do", R.raw.something);
        addSample("The soup thing", R.raw.soup);
        addSample("We live in a spaceship", R.raw.spaceship);
        addSample("How did your brain learn speech", R.raw.speech);
        addSample("Complete This Land", R.raw.thislandcomplete);
        addSample("We shall call this land", R.raw.thisland);
        addSample("inevitable betrayal", R.raw.betrayal);
        addSample("Manly Fashion", R.raw.manlyfashion);
        addSample("Manly Fashion whole", R.raw.manlyfashionwhole);
    }
}