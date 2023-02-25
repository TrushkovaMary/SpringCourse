package ru.alishev.springcourse;

public class PopMusic implements Music{
    String[] songs = {"Imagine", "Dance Monkey", "Perfect"};
    @Override
    public String[] getSongs() {
        return songs;
    }
}
