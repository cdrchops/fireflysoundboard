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
package com.cobradoc.firefly;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TabHost;
import com.cobradoc.firefly.landscapeTabs.LandscapeTab1;
import com.cobradoc.firefly.landscapeTabs.LandscapeTab2;
import com.cobradoc.firefly.landscapeTabs.LandscapeTab3;
import com.cobradoc.firefly.landscapeTabs.LandscapeTab4;
import com.cobradoc.firefly.landscapeTabs.LandscapeTab5;
import com.cobradoc.firefly.landscapeTabs.LandscapeTab6;
import com.cobradoc.firefly.landscapeTabs.LandscapeTab7;
import com.cobradoc.firefly.portraitTabs.PortraitTab1;
import com.cobradoc.firefly.portraitTabs.PortraitTab2;
import com.cobradoc.firefly.portraitTabs.PortraitTab3;
import com.cobradoc.firefly.portraitTabs.PortraitTab4;
import com.cobradoc.firefly.portraitTabs.PortraitTab5;
import com.cobradoc.firefly.portraitTabs.PortraitTab6;
import com.cobradoc.util.DisplayUtil;

/**
 * @author StandTrooper
 * @since Mar 19, 2010 - 11:41:15 AM
 */
public class TabbedLayout extends BaseLayout {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabbed_layout);

        final TabHost tabs = (TabHost) findViewById(R.id.tabhost);

        tabs.setup();

        if (DisplayUtil.getscrOrientation(this) == Configuration.ORIENTATION_PORTRAIT) {
            tabs.addTab(tabs.newTabSpec("Tab1").setIndicator("Tab1").setContent(R.id.tab1));
            tabs.addTab(tabs.newTabSpec("Tab2").setIndicator("Tab2").setContent(R.id.tab2));
            tabs.addTab(tabs.newTabSpec("Tab3").setIndicator("Tab3").setContent(R.id.tab3));
            tabs.addTab(tabs.newTabSpec("Tab4").setIndicator("Tab4").setContent(R.id.tab4));
            tabs.addTab(tabs.newTabSpec("Tab5").setIndicator("Tab5").setContent(R.id.tab5));
            tabs.addTab(tabs.newTabSpec("Tab6").setIndicator("Newest").setContent(R.id.tab6));

            createGrid(R.id.tab1, new PortraitTab1());
            createGrid(R.id.tab2, new PortraitTab2());
            createGrid(R.id.tab3, new PortraitTab3());
            createGrid(R.id.tab4, new PortraitTab4());
            createGrid(R.id.tab5, new PortraitTab5());
            createGrid(R.id.tab6, new PortraitTab6());
        } else {//Configuration.ORIENTATION_LANDSCAPE
            tabs.addTab(tabs.newTabSpec("Tab1").setIndicator("Tab1").setContent(R.id.tab1));
            tabs.addTab(tabs.newTabSpec("Tab2").setIndicator("Tab2").setContent(R.id.tab2));
            tabs.addTab(tabs.newTabSpec("Tab3").setIndicator("Tab3").setContent(R.id.tab3));
            tabs.addTab(tabs.newTabSpec("Tab4").setIndicator("Tab4").setContent(R.id.tab4));
            tabs.addTab(tabs.newTabSpec("Tab5").setIndicator("Tab5").setContent(R.id.tab5));
            tabs.addTab(tabs.newTabSpec("Tab6").setIndicator("Tab6").setContent(R.id.tab6));
//            tabs.addTab(tabs.newTabSpec("Tab7").setIndicator("Tab7").setContent(R.id.tab7));
            createGrid(R.id.tab1, new LandscapeTab1());
            createGrid(R.id.tab2, new LandscapeTab2());
            createGrid(R.id.tab3, new LandscapeTab3());
            createGrid(R.id.tab4, new LandscapeTab4());
            createGrid(R.id.tab5, new LandscapeTab5());
            createGrid(R.id.tab6, new LandscapeTab6());
//            createGrid(R.id.tab7, new LandscapeTab7());
        }

        tabs.setCurrentTab(0);
    }


}
