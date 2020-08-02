package ru.job4j.oop;

public class Wolf {
    public void tryEat(Ball ball) {
        Wolf fairyWolf = new Wolf();
        String result = ball.doesBallGotEaten(fairyWolf);
        System.out.println("Волк попробовал слушать колобка... " + result);
    }
}
