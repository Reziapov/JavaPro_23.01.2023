package com.hillel.reziapov.homeworks.homework4;

public class Animal {

    public String name;
    private int distanceRun;
    private int distanceSwim;
    private static int sumCounterAnimal = 0;

    public static int getSumCounterAnimal() {
        return sumCounterAnimal;
    }

    public String getName() {
        return name;
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    public int getDistanceSwim() {
        return distanceSwim;
    }

    public Animal(String name, int distanceRun, int distanceSwim) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        sumCounterAnimal++;
    }

    public static void demo(Animal animal) {
        if (animal instanceof Runnable) {
            ((Runnable) animal).run();
        }
        if (animal instanceof Swimmable) {
            ((Swimmable) animal).swim();
        }
    }
}
