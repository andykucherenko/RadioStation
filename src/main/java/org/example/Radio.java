package org.example;

public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentRadioStation = minStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {

        if (currentRadioStation != 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {

        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {

        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}