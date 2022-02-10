package ru.spring.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClassicalMusic implements Music {
    @Override
    public ArrayList<String> getSong() {
        ArrayList <String> song = new ArrayList<String>();
        song.add("Simphony 41");
        song.add("Season");
        song.add("Moon sonata");
        return song;
    }
}
