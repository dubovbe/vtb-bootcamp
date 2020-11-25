package ru.dubov.vtb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private PopMusic popMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, PopMusic popMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.popMusic = popMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "playing: " + classicalMusic.getSong();
    }
}
