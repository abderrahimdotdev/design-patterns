package designpatterns.behavioral.state;

import designpatterns.behavioral.state.context.MusicPlayer;

public class Demo {
    public static void main(String[] args) {

        /*
         *********
         * State *
         *********
         *
         * The State design pattern is a behavioral design pattern that allows an object
         * to change its behavior when its internal state changes. It's particularly
         * useful when an object needs to exhibit different behaviors based on its
         * current state, without resorting to large conditional statements.
         */

        MusicPlayer mp = new MusicPlayer();

        mp.turnUpVolume(); // OUTPUT: Increasing the volume...
        mp.pressPowerButton(); // OUTPUT: Turning off the music player...
        mp.turnUpVolume(); // OUTPUT: Cannot change the volume when the music player is off.
    }
}
