package ru.alishev.springcourse;

//import com.sun.org.apache.xerces.internal.xs.StringList;
import org.springframework.stereotype.Component;

//import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class RockMusic implements Music {
    String[] songs = {"Wind cries Mary", "Bohemian Rhapsody", "Beggin"};
    @Override
    public String[] getSongs() {
        return songs;
    }
}
