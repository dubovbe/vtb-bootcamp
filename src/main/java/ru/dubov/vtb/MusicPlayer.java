package ru.dubov.vtb;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    String name;
    int volume;
    Music music;
    List<Music> musicList = new ArrayList<>();

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

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

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void doMyInit() {
        System.out.println("Music Player initialization...");
    }

    public void doMyDestroy() {
        System.out.println("Music Player destruction...");
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    /*@Override
    public String toString() {
        return name + " " + volume;
    }*/
}
