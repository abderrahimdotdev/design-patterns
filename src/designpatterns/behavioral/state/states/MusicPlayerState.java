package designpatterns.behavioral.state.states;

import designpatterns.behavioral.state.context.MusicPlayer;

// State interface (could be an abstract class): Declares methods that concrete states should implement.
public interface MusicPlayerState {

    void turnUpVolume();

    void turnDownVolume();

    void pressPowerButton(MusicPlayer musicPlayer);
}
