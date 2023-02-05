package com.hillel.reziapov.homeworks.homework5;

public class ObstacleRaceTrack implements Obstacle {
    @Override
    public void start(Participant participant) {
        participant.run();
    }
}
