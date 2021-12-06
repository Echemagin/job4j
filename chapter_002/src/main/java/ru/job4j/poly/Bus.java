package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void passengersCount(int count) {
        System.out.println("Колличество пассажиров в автобусе: " + count);
    }

    @Override
    public int refuel(int litres) {
        return litres * 50;
    }
}
