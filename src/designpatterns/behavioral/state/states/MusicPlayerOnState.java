package designpatterns.behavioral.state.states;

import designpatterns.behavioral.state.context.MusicPlayer;

public class MusicPlayerOnState implements MusicPlayerState {

    @Override
    public void turnUpVolume() {
        System.out.println("Increasing the volume...");
    }

    @Override
    public void turnDownVolume() {
        System.out.println("Decreasing the volume...");
    }

    @Override
    public void pressPowerButton(MusicPlayer musicPlayer) {
        System.out.println("Turning off the music player...");
        musicPlayer.setState(new MusicPlayerOffState());
    }
}
