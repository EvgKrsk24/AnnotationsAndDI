package ru.spring.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
//    @Autowired
//    @Qualifier("classicalMusic")// тк 2 бина от инт Music, указываем id конкретного
//    private  Music  music;

    private Music music1;
    private Music music2;


    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,@Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    //    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;


//    @Autowired // внедрение сразу 2х бинов
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    //    @Autowired // внедрение чз поле
//    private Music music;

    //@Autowired // внедрение чз конструктор
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
    //@Autowired // внедрение чз сеттер
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String playMusic(MusicStyle musicStyle) {
        Random ran = new Random(); //выбор рандомного трека
if (musicStyle==MusicStyle.ROCK){
    String random = (String) music1.getSong().get(ran.nextInt(music1.getSong().size())); // рандом из списка песен
    return "Playing " + random; }
else if (musicStyle==MusicStyle.CLASSICAL) {
    String random = (String) music2.getSong().get(ran.nextInt(music2.getSong().size())); // рандом из списка песен
    return "Playing " + random;
}
       // return "Playing: " + music.getSong();
      //  System.out.println("Playing: " + classicalMusic.getSong());
      //  System.out.println("Playing: " + rockMusic.getSong());
     else return null;
    }

}

