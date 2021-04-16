package ru.netology.domain;

public class Radio {
    private int numberStation;
    private int soundVolume;
    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxStation, int maxVolume) {
        this.maxStation = maxStation;
        this.maxVolume = maxVolume;
    }

    public Radio() {
    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation >= minStation && numberStation <= maxStation) this.numberStation = numberStation;
    }

    public void next() {
        if (numberStation == maxStation) {
            numberStation = minStation;
            return;
        }
        numberStation++;
    }

    public void prev() {
        if (numberStation == minStation) {
            numberStation = maxStation;
            return;
        }
        numberStation--;
    }

    public void plus() {
        if (soundVolume == maxVolume) return;
        soundVolume++;
    }

    public void minus() {
        if (soundVolume == minVolume) return;
        soundVolume--;
    }
}
