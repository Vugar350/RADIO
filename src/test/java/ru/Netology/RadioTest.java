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
    public void switchPrevCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(1000);
        rad.switchPrevCurrentStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);

    }
    @Test
    public void setCurrentStation(){
        Radio rad = new Radio();
        rad.setCurrentStation(1000);
        int expected=0;
        int actual= rad.getCurrentStation();
        assertEquals(expected,actual);

    }
}