package ru.netology.Radio.services;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentStation =0;
    private int maxStation = 9;
    private int minStation = 0;
    private int stationNext = 0;
    private int stationPrev = 0;

    private int maxVolume =10;
    private int minVolume =0;
    private int currentVolume = 0;



    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
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

    public void stationNext() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void stationPrev() {
        if (currentStation != 0) {      //!= не равна нулю
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeNext() {
        if (currentVolume != 10) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }


    public void volumePrev() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 10;
        }
    }
}



