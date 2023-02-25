package ru.alishev.springcourse;

//import com.sun.org.apache.xerces.internal.xs.StringList;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
@Scope("singleton")
public class RockMusic implements Music {
    String[] songs = {"Wind cries Mary", "Bohemian Rhapsody", "Beggin"};
    @Override
    public String[] getSongs() {
        return songs;
    }
}
