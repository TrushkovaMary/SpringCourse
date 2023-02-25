package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Neil Alishev
 */
@Component
@Scope("prototype")
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private PopMusic popMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, PopMusic popMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public String playMusic(Genre genre) {
        switch (genre) {
            case Rock:
                return "Playing: " + rockMusic.songs[(int) (Math.random()*rockMusic.songs.length)];
            case Classical:
                return "Playing: " + classicalMusic.songs[(int) (Math.random()*classicalMusic.songs.length)];
            case Pop:
                return "Playing: " + popMusic.songs[(int) (Math.random()*popMusic.songs.length)];
        }
        return "Playing: ";
    }
}
