package com.galvanize;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTests {

    @Test
    void initializeTelevisionTest() {
        Channel hbo = new Channel(1, "HBO");
        Channel showtime = new Channel(2, "Showtime");
        Channel abc = new Channel(3, "ABC");

        List<Channel> channels = Arrays.asList(hbo, showtime, abc);
        Television television = new Television(channels);

        assertEquals("HBO", channels.get(0).getChannelName(), "should return correcrt channel name");
    }

    @Test
    void televisionIsOffByDefaultTest() {
        Television television = new Television();

        assertFalse(television.isOn(), "television should be off by default");
    }

    @Test
    void turnTelevisionOnTest() {
        Television television = new Television();
        television.turnOn();

        assertTrue(television.isOn(), "television should be on after turning on");
    }

    @Test
    void turnTelevisionOffTest() {
        Television television = new Television();
        television.turnOn();
        television.turnOff();

        assertFalse(television.isOn(), "television should be off after turning off");
    }

    @Test
    void checkCurrentChannelTest() {
        Channel hbo = new Channel(1, "HBO");
        Channel showtime = new Channel(2, "Showtime");
        Channel abc = new Channel(3, "ABC");

        List<Channel> channels = Arrays.asList(hbo, showtime, abc);
        Television television = new Television(channels);

        assertEquals("1 - HBO", television.currentChannel(), "should return current channel");
    }

    @Test
    void changeChannelTest() {
        Channel hbo = new Channel(1, "HBO");
        Channel showtime = new Channel(2, "Showtime");
        Channel abc = new Channel(3, "ABC");

        List<Channel> channels = Arrays.asList(hbo, showtime, abc);
        Television television = new Television(channels);
        television.increaseChannel();

        assertEquals("2 - Showtime", television.currentChannel(), "should return current channel");

        television.increaseChannel();
        television.increaseChannel();
        assertEquals("1 - HBO", television.currentChannel(), "should return current channel");

        television.decreaseChannel();
        assertEquals("3 - ABC", television.currentChannel(), "should return current channel");

    }
}
