package dev.abderrahim.designpatterns.state.states;

import dev.abderrahim.designpatterns.state.context.MusicPlayer;

// State interface (could be an abstract class): Declares methods that concrete states should implement.
public interface MusicPlayerState {

    void turnUpVolume();

    void turnDownVolume();

    void pressPowerButton(MusicPlayer musicPlayer);
}
