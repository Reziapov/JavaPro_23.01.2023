package com.hillel.reziapov.homeworks.homework4;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Bobik");
        Cat cat = new Cat("Tom");
        Dog dog1 = new Dog("Sharik");


        dog.run(500);
        dog.swim(10);
        dog1.run(450);
        dog1.swim(15);
        cat.run(200);
        cat.swim();


        System.out.println("Кількість собак: " + Dog.getCounterDog());
        System.out.println("Кількість котів: " + Cat.getCounterCat());
        System.out.println("Кількість тварин: " + Animal.getSumCounterAnimal());

    }

}