package ru.Netology;

public class Radio {
    private int currentStation;
    private int minRadioStation;
    private int maxRadioStation = 9;
    private int volume;
    private int minVolume;
    private int maxVolume = 100;


    public Radio(int currentRadioStation, int maxRadioStation, int volume, int maxVolume) {
        this.currentStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.volume = volume;
        this.maxVolume = maxVolume;
    }

    public int getCurrentStation() {
        return currentStation;

    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minRadioStation) {
            return;
        }
        if (currentStation > maxRadioStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int switchCurrentStation() {
        if (currentStation >= maxRadioStation) {
            currentStation = minRadioStation;
        } else {
            currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int switchPrevCurrentStation() {
        if (currentStation <= minRadioStation) {
            this.currentStation = maxRadioStation;
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





































