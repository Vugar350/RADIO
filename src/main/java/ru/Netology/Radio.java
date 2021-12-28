package ru.Netology;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void switchCurrentStation() {
        if (currentStation < 9) {
            this.currentStation = currentStation + 1;
        } else if (currentStation == 9) {
            this.currentStation = 0;
        }

    }

    public void switchPrevCurrentStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
        } else if (currentStation <= 9) {
            this.currentStation = currentStation - 1;
        }
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume=0;
        }
        if (currentVolume > 10) {
            currentVolume=10;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;



        }
    }
    public void decreaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;

        }

    }


    }





















