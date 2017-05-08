package com.salimov.yurii.incamp.basicoop;

public class RefrigeratorWithSensorPanel extends SimpleRefrigerator
        implements Refrigerator, SensorPanel {

    @Override
    public String toString() {
        return "RefrigeratorWithSensorPanel{" +
                "worked=" + isWorked() +
                ", temperature=" + getCurrentTemperature() +
                '}';
    }

    @Override
    public int changeTemperature(int temperature) {
        return super.changeTemperature(temperature);
    }

    @Override
    public void unfreeze() {
        super.unfreeze();
    }

    @Override
    public void freeze() {
        super.freeze();
    }

    public void printTemperature() {
        System.out.println("Temperature: " + getCurrentTemperature());
    }
}
