package designpatterns.behavioral.state.context;

import designpatterns.behavioral.state.states.MusicPlayerOnState;
import designpatterns.behavioral.state.states.MusicPlayerState;

// Context: The main class that holds a reference to a State object.
public class MusicPlayer {

    private MusicPlayerState currentState;

    public MusicPlayer(){
        this.currentState = new MusicPlayerOnState(); // Default state        
    }

    public void turnUpVolume(){
        this.currentState.turnUpVolume();
    }

    public void turnDownVolume(){
        this.currentState.turnDownVolume();
    }

    public void pressPowerButton(){
        this.currentState.pressPowerButton(this);
    }

    public void setState(MusicPlayerState newState){
        this.currentState = newState;
    }
}
