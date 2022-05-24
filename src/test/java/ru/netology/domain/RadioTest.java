package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void shouldSetRadioStationInRange() {

        Radio radio = new Radio();
        radio.setRadioStation((byte) 5);

        byte actual = radio.getRadioStation();
        byte expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetRadioStationLessZero() {

        Radio radio = new Radio();
        radio.setRadioStation((byte) -1);

        byte actual = radio.getRadioStation();
        byte expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetRadioStationMore9() {

        Radio radio = new Radio();
        radio.setRadioStation((byte) 10);

        byte actual = radio.getRadioStation();
        byte expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadioStationInRange() {

        Radio radio = new Radio();
        radio.setRadioStation((byte) 5);

        radio.nextRadioStation();

        byte actual = radio.getRadioStation();
        byte expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadioStationEquals9() {

        Radio radio = new Radio();
        radio.setRadioStation((byte) 9);

        radio.nextRadioStation();

        byte actual = radio.getRadioStation();
        byte expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadioStationOver9() {

        Radio radio = new Radio();
        radio.setRadioStation((byte) 13);

        radio.nextRadioStation();

        byte actual = radio.getRadioStation();
        byte expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadioStationLessZero() {

        Radio radio = new Radio();
        radio.setRadioStation((byte) -5);

        radio.nextRadioStation();

        byte actual = radio.getRadioStation();
        byte expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStationInRange() {

        Radio radio = new Radio();
        radio.setRadioStation((byte) 5);

        radio.prevRadioStation();

        byte actual = radio.getRadioStation();
        byte expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStationEqualsZero() {

        Radio radio = new Radio();
        radio.setRadioStation((byte) 0);

        radio.prevRadioStation();

        byte actual = radio.getRadioStation();
        byte expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStationOver9() {

        Radio radio = new Radio();
        radio.setRadioStation((byte) 13);

        radio.prevRadioStation();

        byte actual = radio.getRadioStation();
        byte expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStationLessZero() {

        Radio radio = new Radio();
        radio.setRadioStation((byte) -5);

        radio.prevRadioStation();

        byte actual = radio.getRadioStation();
        byte expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeUp() {

        Radio radio = new Radio();

        radio.increaseVolume();

        byte actual = radio.getVolume();
        byte expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeDownOver10() {

        Radio radio = new Radio();

        for (int i = 0; i < 15; i++) {
            radio.increaseVolume();
        }

        byte actual = radio.getVolume();
        byte expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeEqualsZero() {

        Radio radio = new Radio();

        radio.decreaseVolume();

        byte actual = radio.getVolume();
        byte expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeInRange() {

        Radio radio = new Radio();
        for (int i = 0; i < 5; i++) {
            radio.increaseVolume();
        }

        radio.decreaseVolume();

        byte actual = radio.getVolume();
        byte expected = 4;

        Assertions.assertEquals(expected, actual);
    }
}
