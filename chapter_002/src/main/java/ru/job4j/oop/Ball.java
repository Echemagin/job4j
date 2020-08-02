package ru.job4j.oop;

public class Ball {
    public String doesBallGotEaten(Hare hare) {
        return "Неудачно!";
    }

    public String doesBallGotEaten(Fox fox) {
        return "Удачно!";
    }

    public String doesBallGotEaten(Wolf wolf) {
        return "Неудачно!";
    }
}
