package com.hillel.reziapov.homeworks.homework5;

public class Main {
    public static void main(String[] args) {

        Participant[] participants = {
                new Cat("Cat1"),
                new Cat("Cat2"),
                new Man("Human1"),
                new Man("Human2"),
                new Robot("Robot1"),
                new Robot("Robot2")
        };
        Obstacle[] obstacles = {
                new ObstacleRaceTrack(), new ObstacleWall()
        };

        for (Obstacle obstacle: obstacles) {
            for (Participant participant:participants) {
                obstacle.start(participant);
            }
        }


    }
}
