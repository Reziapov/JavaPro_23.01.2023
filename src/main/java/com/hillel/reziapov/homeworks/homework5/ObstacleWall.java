package com.hillel.reziapov.homeworks.homework5;

public class ObstacleWall implements Obstacle {
    @Override
    public void start(Participant participant) {
        participant.jump();
    }
}
