package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
    private ClassicalMusic classicalMusic;
    @Autowired
    @Qualifier("rockMusic")
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer() {
    }

    public String playMusic(Genre genre) {
        switch (genre) {
            case Rock:
                return "Playing: " + rockMusic.songs[(int) (Math.random()*rockMusic.songs.length)];
            case Classical:
                return "Playing: " + classicalMusic.songs[(int) (Math.random()*classicalMusic.songs.length)];
        }
        return "Playing: ";
    }
}
