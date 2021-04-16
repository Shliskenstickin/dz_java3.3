package ru.netology.domain;

public class Radio {
    private int numberStation;
    private int soundVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getNumberStation() {
        return numberStation;
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

    public int getSoundVolume() {
        return soundVolume;
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
