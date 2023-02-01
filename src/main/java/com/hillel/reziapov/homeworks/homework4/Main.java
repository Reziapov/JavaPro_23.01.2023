package com.hillel.reziapov.homeworks.homework4;

import static com.hillel.reziapov.homeworks.homework4.Animal.demo;

public class Main {
    public static void main(String[] args) {


        Animal dog = new Dog("Bobik", 500, 10);
        Animal cat = new Cat("Tom", 200, 0);
        Animal dog1 = new Dog("Sharik", 350, 20);

        demo(dog);
        demo(cat);

        Dog.getCounterDog();
        Cat.getCounterCat();
        System.out.println(Dog.getCounterDog());
        System.out.println(Cat.getCounterCat());

    }

}