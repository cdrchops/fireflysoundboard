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
 * @author torr
 * @since Mar 17, 2010 - 11:46:37 AM
 */
public class JubalEarly extends Soundboard {

	public JubalEarly() {
		super("Jubal Early");
		initialize();
	}

	private void initialize() {
        addSample("Put the gun away", R.raw.away);
        addSample("nonsensical crap", R.raw.boat);
        addSample("No, I'm a bounty hunter", R.raw.bountyhunter);
        addSample("doesn't anyone care", R.raw.care);
        addSample("Only woman can create child", R.raw.child);
        addSample("River's annoying", R.raw.feel);
        addSample("Here I am", R.raw.hereiam);
        addSample("You folks are insane", R.raw.insane);
        addSample("Are you a Lion?", R.raw.lion);
        addSample("deadly and unpredictable midget", R.raw.midget);
        addSample("You made the right move", R.raw.rightmove);
        addSample("My gorram ship", R.raw.ship);
    }
}