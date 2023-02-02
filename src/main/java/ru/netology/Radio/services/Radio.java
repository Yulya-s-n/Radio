package ru.netology.Radio.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    
    private int id;
    private String name;
    private int currentStation;
    private int maxStation;
    private int minStation;
    private boolean on;
}

   /* private int maxVolume;
    private int minVolume;
    private int currentVolume;*/



   /* public int getCurrentStation() {
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

    public void StationNext() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void StationPrev() {
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

    public void VolumeNext() {
        if (currentVolume != 10) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }


    public void VolumePrev() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 10;
        }

    }*/

