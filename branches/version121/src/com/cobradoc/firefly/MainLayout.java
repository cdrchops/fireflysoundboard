/**
 * $Id$
 * $Copyright$
 */
package com.cobradoc.firefly;

import android.os.Bundle;

/**
 * @author torr
 * @since Mar 19, 2010 - 11:41:24 AM
 */
public class MainLayout extends BaseLayout {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        selection(playerValue);
    }
}
