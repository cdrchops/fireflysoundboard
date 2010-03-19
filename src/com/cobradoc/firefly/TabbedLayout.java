/**
 * $Id$
 * $Copyright$
 */
package com.cobradoc.firefly;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TabHost;
import com.cobradoc.firefly.board.AllSounds;
import com.cobradoc.firefly.board.Jayne;

/**
 * @author torr
 * @since Mar 19, 2010 - 11:41:15 AM
 */
public class TabbedLayout extends BaseLayout {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabbed_layout);
        selection(playerValue);

        TabHost tabs = (TabHost) findViewById(R.id.tabhost);

        tabs.setup();

        tabs.addTab(tabs.newTabSpec("all sounds").setIndicator("All Sounds").setContent(R.id.AllSoundsMenu));
        tabs.addTab(tabs.newTabSpec("jayne").setIndicator("Jayne").setContent(R.id.JayneMenu));
//        tabs.addTab(tabs.newTabSpec("allYourBase_tab").setIndicator(
//                "All Your Base").setContent(R.id.allYourBase));
//        tabs.addTab(tabs.newTabSpec("robotChicken_tab").setIndicator(
//                "Robot Chicken").setContent(R.id.robotChicken));
//        tabs.addTab(tabs.newTabSpec("gaming_tab").setIndicator("Gaming")
//                .setContent(R.id.gaming));
//        tabs.addTab(tabs.newTabSpec("misc_tab").setIndicator("Misc")
//                .setContent(R.id.misc));

        tabs.setCurrentTab(0);

        createGrid(new AllSounds());
        createGrid(new Jayne());
//        GridView allYourBaseGrid = (GridView) findViewById(R.id.AllSoundsMenu);
//        allYourBaseGrid.setAdapter(new SoundboardAdapter(this, new AllSounds()));

    }
}
