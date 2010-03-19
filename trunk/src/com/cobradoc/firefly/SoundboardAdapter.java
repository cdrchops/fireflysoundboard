/*
 * Zappenduster Soundboard - a soundboard for geeks.
 *
 * Copyright (c) 2009 Adrian Marte
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

import java.util.List;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;

public class SoundboardAdapter extends BaseAdapter {

	final BaseLayout context;

	final Soundboard board;

	public SoundboardAdapter(final BaseLayout context, final Soundboard board) {
		this.context = context;
		this.board = board;

		prepare(board);
	}

	private void prepare(final Soundboard board) {
		List<Sample> samples = board.getSamples();

		for (Sample sample : samples) {
			context.prepare(sample);
		}
	}

	public int getCount() {
		return board.getSamples().size();
	}

	public Object getItem(final int position) {
		return null;
	}

	public long getItemId(final int position) {
		return 0;
	}

	public View getView(final int position, final View convertView, final ViewGroup parent) {
		try {
			final Sample sample = board.getSamples().get(position);

			if (sample != null) {
				final Button button = new Button(context);
				button.setText(sample.getName());

				button.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						context.play(sample);
					}
				});

				return button;
			}
		} catch (IndexOutOfBoundsException e) {
			Log.e(getClass().getCanonicalName(), "No sample at position " + position);
		}

		return null;
	}
}
