package ru.dubov.vtb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Music musicBean = context.getBean("musicBean", Music.class);
        // MusicPlayer mp = new MusicPlayer(musicBean);
        // mp.playMusic();

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
