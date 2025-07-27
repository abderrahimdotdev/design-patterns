package dev.abderrahim.designpatterns.state.states;

import dev.abderrahim.designpatterns.state.context.MusicPlayer;

public class MusicPlayerOffState implements MusicPlayerState {

    @Override
    public void turnUpVolume() {
        System.out.println("Cannot change the volume when the music player is off.");
    }

    @Override
    public void turnDownVolume() {
        System.out.println("Cannot change the volume when the music player is off.");
    }

    @Override
    public void pressPowerButton(MusicPlayer musicPlayer) {
        System.out.println("Turning on the music player...");
        musicPlayer.setState(new MusicPlayerOnState());
    }
}
