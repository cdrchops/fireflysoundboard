/**
 * $Id$
 * $Copyright$
 */
package com.cobradoc.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.Display;

/**
 * @author torr
 * @since Mar 19, 2010 - 10:58:35 PM
 */
public class DisplayUtil {
    public static int getscrOrientation(final Activity activity) {
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

    	final Configuration c2a = activity.getResources().getConfiguration();
//        if (c2a.orientation == Configuration.ORIENTATION_PORTRAIT) {
    	
        return c2a.orientation;
    }
}
