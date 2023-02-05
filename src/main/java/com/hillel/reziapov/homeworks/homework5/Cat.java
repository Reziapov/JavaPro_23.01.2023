package com.hillel.reziapov.homeworks.homework5;

public class Cat extends Participant{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " start run");
    }

    @Override
    public void jump() {
        System.out.println(getName() + " start jump");
    }
}
