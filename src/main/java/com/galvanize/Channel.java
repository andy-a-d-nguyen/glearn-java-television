package com.galvanize;

public class Channel {

    private int channelNumber;
    private String channelName;

    public Channel(int channelNumber, String channelName) {
        this.channelNumber = channelNumber;
        this.channelName = channelName;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
