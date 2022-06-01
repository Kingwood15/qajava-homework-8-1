package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Radio {

    private byte maxRadioStation;
    private byte currentRadioStation;
    private byte currentVolume;

    public Radio(int maxRadioStation) {
        if (maxRadioStation > 0) {
            this.maxRadioStation = (byte)(maxRadioStation - 1);
        } else {
            this.maxRadioStation = 10;
        }
    }

    public Radio() {
        this.maxRadioStation = 10;
    }

    public void setCurrentRadioStation(int newRadioStation) {

        if (newRadioStation < 0) {
            return;
        }

        if (newRadioStation > maxRadioStation) {
            return;
        }

        currentRadioStation = (byte) newRadioStation;
    }

    /*
    public byte getRadioStation() {
        return currentRadioStation;
    }
     */

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
    public byte getVolume() {
        return currentVolume;
    }
     */

    public void increaseVolume() {

        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {

        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }
}