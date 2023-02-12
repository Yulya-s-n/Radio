package ru.netology.Radio.services;

public class Radio {

    private int currentStation;
    private int currentVolume;

    private int maxStation;
    private int minStation;

    private int maxVolume;
    private int minVolume;


    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;

    }

    public Radio() {
        maxStation = 9;
        minStation = 0;
        maxVolume = 100;
        minVolume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }


    public void stationNext() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void stationPrev() {
        if (currentStation != minStation) {      //!= не равна нулю
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void volumeNext() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = minVolume;
        }
    }

    public void volumePrev() {
        if (currentVolume != minVolume) {
            currentVolume--;
        } else {
            currentVolume = maxVolume;
        }
    }
}
