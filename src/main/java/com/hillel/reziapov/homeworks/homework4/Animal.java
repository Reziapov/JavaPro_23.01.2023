package com.hillel.reziapov.homeworks.homework4;

public abstract class Animal implements Runnable, Swimmable {

    public String name;
    private static int sumCounterAnimal = 0;

    public static int getSumCounterAnimal() {
        return sumCounterAnimal;
    }

    public String getName() {
        return name;
    }


    public Animal(String name) {
        this.name = name;
        sumCounterAnimal++;
    }


    @Override
    public void run(int distance) {
        System.out.println(getName() + " пробіг " + distance + " метрів");
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " проплив " + distance + " метрів");
    }

}
