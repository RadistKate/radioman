package control;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void switchStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.next();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void maxSwitchStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void backSwitchStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void minSwitchStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void upVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void maxUpVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void higherVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void belowVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void higherStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void belowStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void downVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void minDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);


    }


}

class SecondRadioTest {
    @Test
    public void moreStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(12);
        int expected = 12;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreMoreStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(20);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowMoreStation() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(-5);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}