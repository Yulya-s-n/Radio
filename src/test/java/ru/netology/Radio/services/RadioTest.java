package ru.netology.Radio.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testVoid() {

        Radio radio = new Radio(30);

        radio.setCurrentStation(29);

        int expected = 29;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEdgeMinStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMediumStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEdgeMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEdgeMinStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMediumStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testEdgeMaxStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEdgeMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMediumVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEdgeMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEdgeMinVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMediumVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEdgeMaxVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testNegativeVolume9() {

        Radio radio = new Radio();

        radio.setCurrentVolume(-5);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    /*тесты на переключение следующей и предыдущей станции и звука/
     */
    @Test
    public void testStationNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.stationNext();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationNext2() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.stationNext();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.stationNext();

        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.stationNext();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationNex() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.stationNext();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationNul() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.stationNext();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationPrevNul() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.stationPrev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationPrevMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.stationPrev();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.stationPrev();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testVolumeNext() {
        Radio radio = new Radio();
        radio.setCurrentVolume(97);

        radio.volumeNext();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.volumeNext();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.volumeNext();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeNul() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeNext();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumePrevNul() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumePrev();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumePrevMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.volumePrev();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumePrev() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);
        radio.volumePrev();

        int expected = 97;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
