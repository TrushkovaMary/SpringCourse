package ru.alishev.springcourse;

//import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic firstCclassicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(firstCclassicalMusic.getSong());

        ClassicalMusic secondCclassicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(secondCclassicalMusic.getSong());

        ClassicalMusic thirdCclassicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(thirdCclassicalMusic.getSong());
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayerBean", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayerBean", MusicPlayer.class);
//
//        boolean comparison = musicPlayer1 == musicPlayer2;
//        System.out.println(comparison);
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
