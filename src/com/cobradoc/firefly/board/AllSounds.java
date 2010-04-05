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
package com.cobradoc.firefly.board;

import com.cobradoc.firefly.R;
import com.cobradoc.firefly.Soundboard;

public class AllSounds extends Soundboard {

    public AllSounds() {
        super("All Sounds");
    }

    public void initialize() {
        //Mal
        addSample("This is a bad idea", R.raw.badidea);
        addSample("No touching guns", R.raw.guns);
        addSample("Big Damn Heroes", R.raw.heroes);
        addSample("Jayne's got a job to do", R.raw.job);
        addSample("We're gonna die", R.raw.pretty);
        addSample("Pain is scary", R.raw.scare);
        addSample("Horses are steak", R.raw.steak);
        addSample("aim to misbehave", R.raw.aimtomisbehave);
        addSample("Dirtnap outtake", R.raw.dirtnap);
        addSample("I will end you", R.raw.iwillendyou);
        addSample("Pretty Floral Bonnet", R.raw.prettyfloralbonnet);
        addSample("Take you seriously", R.raw.seriouslytoamiddle);
        addSample("spacecowboy", R.raw.spacecowboy);

        //Wash
        addSample("we're being followed", R.raw.alarm);
        addSample("brow mopper", R.raw.browmop);
        addSample("Here's something you can't do", R.raw.something);
        addSample("The soup thing", R.raw.soup);
        addSample("We live in a spaceship", R.raw.spaceship);
        addSample("How did your brain learn speech", R.raw.speech);
        addSample("Complete This Land", R.raw.thislandcomplete);
        addSample("We shall call this land", R.raw.thisland);
        addSample("inevitable betrayal", R.raw.betrayal);
        addSample("Manly Fashion", R.raw.manlyfashion);
        addSample("Manly Fashion whole", R.raw.manlyfashionwhole);
        
        //Early
        addSample("Put the gun away", R.raw.away);
        addSample("nonsensical crap", R.raw.boat);
        addSample("No, I'm a bounty hunter", R.raw.bountyhunter);
        addSample("doesn't anyone care", R.raw.care);
        addSample("Only woman can create child", R.raw.child);
        addSample("River's annoying", R.raw.feel);
        addSample("Here I am", R.raw.hereiam);
        addSample("You folks are insane", R.raw.insane);
        addSample("Are you a Lion?", R.raw.lion);
        addSample("deadly and unpredictable midget", R.raw.midget);
        addSample("You made the right move", R.raw.rightmove);
        addSample("My gorram ship", R.raw.ship);

        //Kaylee
        addSample("Spacebugs", R.raw.bugs);
        addSample("A-Ok", R.raw.shiny);

        //Jayne
        addSample("Kaylee cheerful", R.raw.cheerful);
        addSample("Not Jaynes fault", R.raw.fault);
        addSample("can't get paid if you're dead", R.raw.nothing);
        addSample("Saint Jayne", R.raw.saintjayne);
        addSample("don't like people hearin what I'm thinkin", R.raw.thinking);
        addSample("She's a witch", R.raw.witch);
        addSample("I'll be in my bunk", R.raw.inmybunk);
        addSample("i call it vera", R.raw.icallitvera);
        addSample("Powerful ugly", R.raw.powerfuluglycreature);
        addSample("Make you prettier", R.raw.prettier);
        addSample("take me seriously", R.raw.takemeseriously);

        //River
        addSample("very crowded", R.raw.crowded);
        addSample("You got issues", R.raw.early);
        addSample("It's just an object", R.raw.object);

        //Simon
        addSample("He's gentle and fuzzy", R.raw.fuzzy);
        addSample("The nice man wants to kidnap you", R.raw.kidnap);
        addSample("You're out of your mind", R.raw.mind);
        addSample("River is Serenity", R.raw.serenity);
        addSample("get in a mans way", R.raw.way);
        addSample("don't worry about me", R.raw.worry);

        //Zoe
        addSample("We should be in Jail", R.raw.jail);
        addSample("wacky fun", R.raw.knife);
        addSample("work work work", R.raw.workwork);

        //Inara
        addSample("You'll be fine", R.raw.fine);

        //Book
        addSample("Half a hump", R.raw.putyou);

        addSample("Firefly theme song", R.raw.theme);
        addSample("Fruity Oaty Bar", R.raw.fruityoatybar);
        addSample("Vera whole", R.raw.verawhole);
    }
}