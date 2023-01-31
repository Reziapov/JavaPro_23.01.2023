package com.hillel.reziapov.homeworks.homework4;

public class Cat extends Animal implements Runnable, Swimmable {

    public Cat(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);
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
