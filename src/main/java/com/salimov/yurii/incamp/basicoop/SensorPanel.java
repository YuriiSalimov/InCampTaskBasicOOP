package com.salimov.yurii.incamp.basicoop;

public interface SensorPanel {

    void freeze();

    void unfreeze();

    int changeTemperature(int temperature);

    void printTemperature();
}
