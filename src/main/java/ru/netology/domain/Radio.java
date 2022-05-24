package ru.netology.domain;

public class Radio {

    private byte currentRadioStation;
    private byte currentVolume;

    public void setRadioStation(byte newRadioStation) {

        if (newRadioStation < 0) {
            return;
        }

        if (newRadioStation > 9) {
            return;
        }

        currentRadioStation = newRadioStation;
    }

    public byte getRadioStation() {
        return currentRadioStation;
    }

    public void nextRadioStation() {

        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {

        if (currentRadioStation > 0) {
            currentRadioStation -= 1;
        } else {
            currentRadioStation = 9;
        }
    }

    /*
    private void setVolume(byte newVolume) {

        if (newVolume < 0) {
            return;
        }

        if (newVolume > 10) {
            return;
        }

        volume = newVolume;
    }
    */

    public byte getVolume() {
        return currentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {

        if (currentVolume > 0){
            currentVolume -= 1;
        }
    }
}
