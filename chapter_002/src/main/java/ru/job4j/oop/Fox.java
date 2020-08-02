package ru.job4j.oop;

public class Fox {
    public void tryEat(Ball ball) {
        Fox fairyFox = new Fox();
        String result = ball.doesBallGotEaten(fairyFox);
        System.out.println("Лисица попробовала слушать колобка... " + result);
    }
}
