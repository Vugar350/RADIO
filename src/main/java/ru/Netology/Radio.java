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
            this.currentStation = currentStation=9;
        } else if (currentStation <=9) {
            this.currentStation=currentStation-1;
        }
    }
    }













