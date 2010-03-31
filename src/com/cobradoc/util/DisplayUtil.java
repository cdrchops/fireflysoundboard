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
package com.cobradoc.util;

import android.app.Activity;
import android.content.res.Configuration;

/**
 * @author torr
 * @since Mar 19, 2010 - 10:58:35 PM
 */
public class DisplayUtil {
    public static int getscrOrientation(final Activity activity) {
        final Configuration conf = activity.getResources().getConfiguration();
//        if (conf.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//
//        }

//        final Display getOrient = activity.getWindowManager().getDefaultDisplay();
//
//        int orientation = getOrient.getOrientation();
//
//        // Sometimes you may get undefined orientation Value is 0
//        // simple logic solves the problem compare the screen
//        // X,Y Co-ordinates and determine the Orientation in such cases
//        if (orientation == Configuration.ORIENTATION_UNDEFINED) {
//
//            final Configuration config = activity.getResources().getConfiguration();
//            orientation = config.orientation;
//
//            if (orientation == Configuration.ORIENTATION_UNDEFINED) {
//                //if height and width of screen are equal then
//                // it is square orientation
//                if (getOrient.getWidth() == getOrient.getHeight()) {
//                    orientation = Configuration.ORIENTATION_SQUARE;
//                } else { //if widht is less than height than it is portrait
//                    if (getOrient.getWidth() < getOrient.getHeight()) {
//                        orientation = Configuration.ORIENTATION_PORTRAIT;
//                    } else { // if it is not any of the above it will defineitly be landscape
//                        orientation = Configuration.ORIENTATION_LANDSCAPE;
//                    }
//                }
//            }
//        }

        return conf.orientation;
    }
}
