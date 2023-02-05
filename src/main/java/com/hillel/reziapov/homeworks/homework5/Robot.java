package com.hillel.reziapov.homeworks.homework5;

public class Robot extends Participant {

    public Robot(String name) {
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
