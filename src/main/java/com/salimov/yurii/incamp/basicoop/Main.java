package com.salimov.yurii.incamp.basicoop;

public class Main {

    public static void main(String[] args) {
        Refrigerator refrigerator = new SimpleRefrigerator();
        refrigerator.on();
        System.out.println(refrigerator);
        refrigerator.off();
        System.out.println(refrigerator);

        refrigerator = new RefrigeratorWithSensorPanel();
        refrigerator.on();
        System.out.println(refrigerator);
        SensorPanel sensorPanel = (SensorPanel) refrigerator;
        sensorPanel.unfreeze();
        System.out.println(refrigerator);
        sensorPanel.freeze();
        System.out.println(refrigerator);
    }
}
