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
package com.cobradoc.firefly;

public class Sample {

	private String text;

	private int resId;

	public Sample(String text, int resId) {
		this.text = text;
		this.resId = resId;
	}

	public String getName() {
		return text;
	}

	public int getResId() {
		return resId;
	}

}
