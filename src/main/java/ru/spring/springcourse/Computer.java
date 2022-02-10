package ru.spring.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // объявлем бином
public class Computer {
    private int id;
    private MusicPlayer musicPlayer; //те внутри пк есть musicPlayer

    @Autowired // внедрение бина авто (musicPlayer - цепочка внедрения,в него тоже внедряем авто)
    public Computer(MusicPlayer musicPlayer) {
        this.id=1; //не внедряется спринг, прописан вручную
        this.musicPlayer = musicPlayer; // внедряется спрингом
    }

    @Override
    public String toString() {
        return "Computer" + id + " " + musicPlayer.playMusic(MusicStyle.ROCK); // ROCK or CLASSICAL
    }
}
