package ru.netology.Radio.services;

public class Radio {

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentStation = minRadioStation;


    private int maxVolume = 100;
    private int minVolume = 0;

    private int currentVolume = minVolume;


    public Radio() {

    }

    public Radio(int minRadioStation, int maxRadioStation, int minVolume, int maxVolume) {


        this.minRadioStation =minRadioStation;
        this.maxRadioStation =maxRadioStation;
        this.currentStation = minRadioStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = minVolume;
    }

    public Radio(int currentStation) {
        this.currentStation = currentStation;
        maxRadioStation = currentStation + 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
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

    public void stationNext() {
        if (currentStation != maxRadioStation) {
            currentStation++;
        } else {
            currentStation = minRadioStation;
        }
    }

    public void stationPrev() {
        if (currentStation != minRadioStation) {      //!= не равна нулю
            currentStation--;
        } else {
            currentStation = maxRadioStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
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
