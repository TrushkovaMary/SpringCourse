package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {
    String[] songs = {"Hungarian Rhapsody", "Ave Maria", "Flight of the Bumblebee"};
    @Override
    public String[] getSongs() {
        return songs;
    }
}
