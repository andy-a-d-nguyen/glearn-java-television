package com.galvanize;

import java.util.List;

public class Television {

    private List<Channel> television;
    private boolean isOn = false;
    private int currentChannelNumber;
    private String currentChannel;

    public Television(){}

    public Television(List<Channel> television) {
        this.television = television;
        this.setCurrentChannel();
    }

    public List<Channel> getTelevision() {
        return television;
    }

    public void setTelevision(List<Channel> television) {
        this.television = television;
    }

    public void setCurrentChannel() {
        this.currentChannel = television.get(currentChannelNumber).getChannelNumber() + " - " + television.get(currentChannelNumber).getChannelName();
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public String currentChannel() {
        return this.currentChannel;
    }

    public void increaseChannel() {
        this.currentChannelNumber++;
        if (this.currentChannelNumber >= television.size()) {
            this.currentChannelNumber = 0;
        }
        this.setCurrentChannel();
    }

    public void decreaseChannel() {
        this.currentChannelNumber--;
        if (this.currentChannelNumber <= 0) {
            this.currentChannelNumber = television.size() - 1;
        }
        this.setCurrentChannel();
    }
}
