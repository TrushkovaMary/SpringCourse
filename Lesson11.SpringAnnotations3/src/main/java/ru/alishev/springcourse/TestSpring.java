package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("rockMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
//
//        classicalMusicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.playMusic(Genre.Rock));
//
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer1.playMusic(Genre.Classical));
//        System.out.println(musicPlayer==musicPlayer1);


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic(Genre.Classical));
        System.out.println(musicPlayer.playMusic(Genre.Rock));
        System.out.println(musicPlayer.playMusic(Genre.Pop));

        System.out.println(musicPlayer.playMusic(Genre.Classical));
        System.out.println(musicPlayer.playMusic(Genre.Rock));
        System.out.println(musicPlayer.playMusic(Genre.Pop));
        context.close();
    }
}
