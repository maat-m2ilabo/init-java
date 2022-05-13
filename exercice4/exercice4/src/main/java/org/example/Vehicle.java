package org.example;

public abstract class Vehicle {
        protected float currentGas;
        protected float gasCapacity;
        protected float gasConsumption;
        protected int speed;
        protected int passengerCapacity;

    public float getCurrentGas() {
        return currentGas;
    }

    public float getGasCapacity() {
        return gasCapacity;
    }

    public float getGasConsumption() {
        return gasConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setCurrentGas(float currentGas) {
        this.currentGas = currentGas;
    }

    public void setGasCapacity(float gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    public void setGasConsumption(float gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}