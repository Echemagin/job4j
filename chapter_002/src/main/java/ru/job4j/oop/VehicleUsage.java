package ru.job4j.oop;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle plain = new Plain();
        Vehicle boeng = new Plain();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle sapsan = new Train();

        Vehicle[] vehicles = new Vehicle[]{plain, bus, train, boeng, sapsan};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
