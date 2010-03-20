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
public class Mal extends Soundboard {

    public Mal() {
        super("Malcom Reynolds");
        initialize();
    }

    private void initialize() {
        addSample("This is a bad idea", R.raw.badidea);
        addSample("No touching guns", R.raw.guns);
        addSample("Big Damn Heroes", R.raw.heroes);
        addSample("Jayne's got a job to do", R.raw.job);
        addSample("We're gonna die", R.raw.pretty);
        addSample("Pain is scary", R.raw.scare);
        addSample("Horses are steak", R.raw.steak);
    }
}