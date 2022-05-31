package ru.netology.domain;

public class Radio {

    private byte maxRadioStation;
    private byte currentRadioStation;
    private byte currentVolume;

    public Radio(int maxRadioStation){
        this.maxRadioStation = (byte)(maxRadioStation-1);
    }

    public Radio() {
        this.maxRadioStation = 10;
    }

    public void setRadioStation(int newRadioStation) {

        if (newRadioStation < 0) {
            return;
        }

        if (newRadioStation > maxRadioStation) {
            return;
        }

        currentRadioStation = (byte)newRadioStation;
    }

    public byte getRadioStation() {
        return currentRadioStation;
    }

    public void nextRadioStation() {

        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {

        if (currentRadioStation > 0) {
            currentRadioStation -= 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    /*
    private void setVolume(byte newVolume) {

        if (newVolume < 0) {
            return;
        }

        if (newVolume > 100) {
            return;
        }

        volume = newVolume;
    }
    */

    public byte getVolume() {
        return currentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {

        if (currentVolume > 0){
            currentVolume -= 1;
        }
    }
}
