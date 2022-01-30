package ru.Netology;

public class Radio {
    private int currentStation;
    private int minRadioStation;
    private int countRadioStation = 10;
    private int volume;
    private int minVolume;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int countRadioStation) {
        this.countRadioStation = countRadioStation;

    }

    public int getCurrentStation() {
        return currentStation;

    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = countRadioStation - 1;
        }
        if (currentStation >= countRadioStation) {
            currentStation = 0;
        }
        this.currentStation = currentStation;
    }

    public int switchCurrentStation() {
        if (currentStation >= countRadioStation - 1) {
            currentStation = minRadioStation;
        } else {
            currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int switchPrevCurrentStation() {
        if (currentStation <= minRadioStation) {
            this.currentStation = countRadioStation - 1;
        } else {
            this.currentStation = currentStation - 1;
        }
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;

        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;

        }

    }


}





































