package dev.abderrahim.designpatterns.state.states;

import dev.abderrahim.designpatterns.state.context.MusicPlayer;

public interface MusicPlayerState {

    void turnUpVolume();

    void turnDownVolume();

    void pressPowerButton(MusicPlayer musicPlayer);
}
