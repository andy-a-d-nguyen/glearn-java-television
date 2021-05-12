package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChannelTests {

    @Test
    void initializeChannelTest() {
        Channel hbo = new Channel(1, "HBO");

        assertEquals(1, hbo.getChannelNumber(), "should return channel number");
        assertEquals("HBO", hbo.getChannelName(), "should return channel name");
    }
}
