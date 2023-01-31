package com.hillel.reziapov.homeworks.homework4;

import static com.hillel.reziapov.homeworks.homework4.Animal.demo;

public class Main {
    public static void main(String[] args) {


        Animal dog = new Dog("Bobik", 500, 10);
        Animal cat = new Cat("Tom", 200, 0);

        demo(dog);
        demo(cat);

        Dog.getCounterDog();
        Cat.getCounterCat();

    }

}