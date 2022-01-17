package ru.Netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void switchCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.switchCurrentStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void switch1CurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);
        rad.switchCurrentStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void switch2CurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.switchCurrentStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void switchPrevCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.switchPrevCurrentStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void switch1PrevCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.switchPrevCurrentStation();
        int expected = 8;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }


    @Test
    public void setCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void set2CurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);
        rad.increaseVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increase1Volume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        rad.increaseVolume();
        int expected = 12;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void increase1VolumeOverMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(2);
        rad.decreaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void decrease1Volume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }
    @Test
    public void setCurrentVolumeOverMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void set1CurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        int expected = 11;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);

    }


}