package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private Music music;
    private String name;
    private int volume;
    public MusicPlayer(){
    }
    public MusicPlayer(Music music){
        this.musicList.add(music);
    }
    public void setMusic(Music music) {
        this.musicList.add(music);
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList.addAll(musicList);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(){
        System.out.println("Playing: "+musicList.get(musicList.size()-1).getSong());
    }



}
