/**
 * $Id$
 * $Copyright$
 */
package com.cobradoc.firefly;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

/**
 * @author torr
 * @since Mar 19, 2010 - 11:16:49 AM
 */
public class Settings extends Activity {
    public static boolean isTabbedLayout = false;
    private boolean hasChanged = false;

    @Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);

        CheckBox tabbedLayout = (CheckBox) findViewById(R.id.tabbedLayout);
        tabbedLayout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                isTabbedLayout = !isTabbedLayout;
                hasChanged = true;
            }
        });

        tabbedLayout.setChecked(isTabbedLayout);

        if (hasChanged) {
            startActivity(new Intent(this, TabbedLayout.class));
        }

	}
}
