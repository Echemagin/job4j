package ru.job4j.oop;

public class Hare {
    public void tryEat(Ball ball) {
        Hare fairyHare = new Hare();
        String result = ball.doesBallGotEaten(fairyHare);
        System.out.println("Заяц попробовал слушать колобка... " + result);
    }
}
