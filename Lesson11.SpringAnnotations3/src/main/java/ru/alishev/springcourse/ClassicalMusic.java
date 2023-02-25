package ru.alishev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Neil Alishev
 */
@Component
//@Scope("singleton")
public class ClassicalMusic implements Music {
    String[] songs = {"Hungarian Rhapsody", "Ave Maria", "Flight of the Bumblebee"};
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroying");
    }
    @Override
    public String[] getSongs() {
        return songs;
    }
}
