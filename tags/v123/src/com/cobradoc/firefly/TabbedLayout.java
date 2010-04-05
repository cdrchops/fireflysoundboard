/**
 * $Id$
 * $Copyright$
 */
package com.cobradoc.firefly;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TabHost;
import com.cobradoc.firefly.landscapeTabs.*;
import com.cobradoc.firefly.portraitTabs.*;
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
            tabs.addTab(tabs.newTabSpec("Tab6").setIndicator("Tab6").setContent(R.id.tab6));
            tabs.addTab(tabs.newTabSpec("Tab7").setIndicator("Tab7").setContent(R.id.tab7));

            createGrid(R.id.tab1, new PortraitTab1());
            createGrid(R.id.tab2, new PortraitTab2());
            createGrid(R.id.tab3, new PortraitTab3());
            createGrid(R.id.tab4, new PortraitTab4());
            createGrid(R.id.tab5, new PortraitTab5());
            createGrid(R.id.tab6, new PortraitTab6());
            createGrid(R.id.tab7, new PortraitTab7());
        } else {//Configuration.ORIENTATION_LANDSCAPE
            tabs.addTab(tabs.newTabSpec("Tab1").setIndicator("Tab1").setContent(R.id.tab1));
            tabs.addTab(tabs.newTabSpec("Tab2").setIndicator("Tab2").setContent(R.id.tab2));
            tabs.addTab(tabs.newTabSpec("Tab3").setIndicator("Tab3").setContent(R.id.tab3));
            tabs.addTab(tabs.newTabSpec("Tab4").setIndicator("Tab4").setContent(R.id.tab4));
            tabs.addTab(tabs.newTabSpec("Tab5").setIndicator("Tab5").setContent(R.id.tab5));
            tabs.addTab(tabs.newTabSpec("Tab6").setIndicator("Tab6").setContent(R.id.tab6));
            tabs.addTab(tabs.newTabSpec("Tab7").setIndicator("Tab7").setContent(R.id.tab7));
            tabs.addTab(tabs.newTabSpec("Tab8").setIndicator("Tab8").setContent(R.id.tab8));
            
            createGrid(R.id.tab1, new LandscapeTab1());
            createGrid(R.id.tab2, new LandscapeTab2());
            createGrid(R.id.tab3, new LandscapeTab3());
            createGrid(R.id.tab4, new LandscapeTab4());
            createGrid(R.id.tab5, new LandscapeTab5());
            createGrid(R.id.tab6, new LandscapeTab6());
            createGrid(R.id.tab7, new LandscapeTab7());
            createGrid(R.id.tab8, new LandscapeTab8());
        }

        tabs.setCurrentTab(0);
    }


}
