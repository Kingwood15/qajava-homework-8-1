package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void shouldSetMaxRadioStationLessZero() {

        Radio radio = new Radio(-2);

        byte actual = radio.getMaxRadioStation();
        byte expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetMaxRadioStationZero() {

        Radio radio = new Radio(0);

        byte actual = radio.getMaxRadioStation();
        byte expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetRadioStationInDefaultRange() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        byte actual = radio.getCurrentRadioStation();
        byte expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetRadioStationInRange() {

        Radio radio = new Radio(47);
        radio.setCurrentRadioStation(24);

        byte actual = radio.getCurrentRadioStation();
        byte expected = 24;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetRadioStationLessZero() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(-2);

        byte actual = radio.getCurrentRadioStation();
        byte expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetRadioStationMoreMax() {

        int TestValueMaxRadioStation = 15;
        Radio radio = new Radio(TestValueMaxRadioStation);
        radio.setCurrentRadioStation(TestValueMaxRadioStation + 15);

        byte actual = radio.getCurrentRadioStation();
        byte expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadioStationInRange() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.nextRadioStation();

        byte actual = radio.getCurrentRadioStation();
        byte expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldNextRadioStationEqualsMax() {

        int TestValueMaxRadioStation = 24;
        Radio radio = new Radio(TestValueMaxRadioStation);
        radio.setCurrentRadioStation(TestValueMaxRadioStation - 1);

        radio.nextRadioStation();

        byte actual = radio.getCurrentRadioStation();
        byte expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStationInRange() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.prevRadioStation();

        byte actual = radio.getCurrentRadioStation();
        byte expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldPrevRadioStationEqualsZero() {

        int TestValueMaxRadioStation = 34;
        Radio radio = new Radio(TestValueMaxRadioStation);
        radio.setCurrentRadioStation(0);

        radio.prevRadioStation();

        byte actual = radio.getCurrentRadioStation();
        byte expected = (byte) (TestValueMaxRadioStation - 1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeUp() {

        Radio radio = new Radio();

        radio.increaseVolume();

        byte actual = radio.getCurrentVolume();
        byte expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeDownOver100() {

        Radio radio = new Radio();

        for (int i = 0; i < 105; i++) {
            radio.increaseVolume();
        }

        byte actual = radio.getCurrentVolume();
        byte expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeEqualsZero() {

        Radio radio = new Radio();

        radio.decreaseVolume();

        byte actual = radio.getCurrentVolume();
        byte expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeInRange() {

        Radio radio = new Radio();
        for (int i = 0; i < 50; i++) {
            radio.increaseVolume();
        }

        radio.decreaseVolume();

        byte actual = radio.getCurrentVolume();
        byte expected = 49;

        Assertions.assertEquals(expected, actual);
    }
}