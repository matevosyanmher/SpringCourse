package am.mher.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;
    public void setMusicList(List<Music> music) {
        musicList.addAll(music);
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

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public MusicPlayer() {
    }

//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing " + music.getSong());
        }
    }
}
