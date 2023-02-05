package com.hillel.reziapov.homeworks.homework5;

public abstract class Participant {

    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void run();

    public abstract void jump();
}
