package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setNumberStation() {
        Radio tapok = new Radio();

        tapok.setNumberStation(1);
        assertEquals(1, tapok.getNumberStation());
    }

    @Test
    void setNumberStationOverMax() {
        Radio tapok = new Radio();

        tapok.setNumberStation(10);
        assertEquals(0, tapok.getNumberStation());
    }

    @Test
    void setNumberStationOverMin() {
        Radio tapok = new Radio();

        tapok.setNumberStation(-1);
        assertEquals(0, tapok.getNumberStation());
    }

    @Test
    void nextNormalJob() {
        Radio tapok = new Radio();

        tapok.next();
        assertEquals(1, tapok.getNumberStation());
    }

    @Test
    void nextLoop() {
        Radio tapok = new Radio();

        tapok.setNumberStation(9);
        tapok.next();
        assertEquals(0, tapok.getNumberStation());
    }

    @Test
    void prevNormalJob() {
        Radio tapok = new Radio();

        tapok.setNumberStation(9);
        tapok.prev();
        assertEquals(8, tapok.getNumberStation());
    }

    @Test
    void plusNormalJob() {
        Radio tapok = new Radio();

        tapok.plus();
        assertEquals(1, tapok.getSoundVolume());
    }

    @Test
    void prevLoop() {
        Radio tapok = new Radio();

        tapok.prev();
        assertEquals(9, tapok.getNumberStation());
    }

    @Test
    void crossingPlusBorder() {
        Radio tapok = new Radio();

        for (int i = 0; i < 11; i++) {
            tapok.plus();
        }
        assertEquals(10, tapok.getSoundVolume());
    }

    @Test
    void minusNormalJob() {
        Radio tapok = new Radio();

        tapok.plus();
        tapok.minus();
        assertEquals(0, tapok.getSoundVolume());
    }

    @Test
    void crossingMinusBorder() {
        Radio tapok = new Radio();

        tapok.minus();
        assertEquals(0, tapok.getSoundVolume());
    }
}