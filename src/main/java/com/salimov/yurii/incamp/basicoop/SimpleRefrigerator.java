package com.salimov.yurii.incamp.basicoop;

public class SimpleRefrigerator implements Refrigerator {

    protected final static int DEFAULT_TEMPERATURE = 20;

    private boolean worked = false;

    private int temperature = DEFAULT_TEMPERATURE;

    @Override
    public String toString() {
        return "SimpleRefrigerator{" +
                "worked=" + isWorked() +
                ", temperature=" + getCurrentTemperature() +
                '}';
    }

    @Override
    public void on() {
        this.worked = true;
        freeze();
    }

    @Override
    public void off() {
        this.worked = false;
        unfreeze();
    }

    protected int changeTemperature(int temperature) {
        return this.temperature += temperature;
    }

    protected void unfreeze() {
        while (isFrozen()) {
            changeTemperature(+1);
        }
    }

    protected void freeze() {
        while (isWorked() && isUnfrozen()) {
            changeTemperature(-1);
        }
    }

    protected int getCurrentTemperature() {
        return this.temperature;
    }

    protected boolean isWorked() {
        return this.worked;
    }

    protected boolean isFrozen() {
        return (getCurrentTemperature() < DEFAULT_TEMPERATURE);
    }

    protected boolean isUnfrozen() {
        return (getCurrentTemperature() > -DEFAULT_TEMPERATURE);
    }
}
