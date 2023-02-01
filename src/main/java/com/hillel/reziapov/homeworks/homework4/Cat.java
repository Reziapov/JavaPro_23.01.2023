package com.hillel.reziapov.homeworks.homework4;

public class Cat extends Animal implements Runnable, Swimmable {

    private static int counterCat = 0;

    public static int getCounterCat() {
        return counterCat;
    }

    public Cat(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);
        counterCat++;
    }

    @Override
    public void run() {
        System.out.println(getName() + " пробіг " + getDistanceRun() + " метрів");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " не вміє плавати");
    }

}
