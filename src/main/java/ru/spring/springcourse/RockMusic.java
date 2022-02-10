package ru.spring.springcourse;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component //("musicBeanRock") //или название бина автоматом как наз кл с маленькой rockMusic
//public class RockMusic implements Music {
//    @Override
//    public String getSong() {
//        return "Wind cries Mary Rock";
//    }
//}

public class RockMusic implements Music {
    @Override
    public ArrayList<String> getSong() {
        ArrayList<String> song = new ArrayList<>();
        song.add("Hard_Rock");
        song.add("Butcher");
        song.add("Colonel");

        return song;
    }
}
