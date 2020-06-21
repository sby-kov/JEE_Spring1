package ru.bystryakov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * User:  Marina
 * Дата:  24.05.2020
 * Время: 19:29
 */
@Component                // теперь пометим плеер через аннотацию Component
public class MusicPlayer {
//    // изменим класс для применения @Autowired
//    private ClassicalMusic classicalMusic;
//    // IoC для ClassicalMusic
//
//    @Autowired  // работает и без
//    public MusicPlayer(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;
//    }
//
//    public void playMusic() {
//            System.out.println("Играет " + classicalMusic.getSong());
//    }
//    @Autowired
//    private Music music;
    // реализуем IoC
//    //@Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    // через setter, в конструкторе закроем
//    @Autowired
//    public void setMusic(Music music) {
////    public void asdfr(Music music) {  // работает! имя метода не важно!
//        this.music = music;
//    }
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    @Autowired          // работает и без нее !
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic() {
        System.out.println("Играет " + classicalMusic.getSong());
        System.out.println("Играет " + rockMusic.getSong());
    }
    public String sayMusicList() {
        return "  1. " + classicalMusic.getSong() + "\n" +
               "  2. " + rockMusic.getSong();
    }

}
