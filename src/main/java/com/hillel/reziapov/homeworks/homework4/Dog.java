package com.hillel.reziapov.homeworks.homework4;

public class Dog extends Animal implements Runnable, Swimmable {

    private static int counterDog = 0;

    public static int getCounterDog() {
        return counterDog;
    }

    public Dog(String name) {
        this.name = name;
        counterDog++;
    }

    public Dog(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);
    }

    @Override
    public void run() {
        System.out.println(getName() + " пробіг " + getDistanceRun() + " метрів");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " проплив " + getDistanceSwim() + " метрів");
    }


}
