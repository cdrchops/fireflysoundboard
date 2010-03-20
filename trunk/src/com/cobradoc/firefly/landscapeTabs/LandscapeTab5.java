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
public class LandscapeTab5 extends Soundboard {

    public LandscapeTab5() {
        super("Tab");
        initialize();
    }

    private void initialize() {
        addSample("She's a witch", R.raw.witch);

        //River
        addSample("very crowded", R.raw.crowded);
        addSample("You got issues", R.raw.early);
        addSample("It's just an object", R.raw.object);

        //Simon
        addSample("He's gentle and fuzzy", R.raw.fuzzy);
        addSample("The nice man wants to kidnap you", R.raw.kidnap);
        addSample("You're out of your mind", R.raw.mind);
        addSample("River is Serenity", R.raw.serenity);

    }

}