package com.bootcampexcercise.module10.activity6;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike Started");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stopped");

    }
}
