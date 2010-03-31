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

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

/**
 * @author torr
 * @since Mar 19, 2010 - 11:16:49 AM
 */
public class Settings extends Activity {
    public static boolean isTabbedLayout = false;
    public static boolean showTabOptions = true;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        CheckBox tabbedLayout = (CheckBox) findViewById(R.id.tabbedLayout);
        tabbedLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                isTabbedLayout = !isTabbedLayout;
            }
        });

        tabbedLayout.setChecked(isTabbedLayout);

        final Context context = getBaseContext();

        Button tabbedButton = (Button) findViewById(R.id.tabbedButton);
        tabbedButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(context, FireflySoundboard.class));
            }
        });
    }
}
