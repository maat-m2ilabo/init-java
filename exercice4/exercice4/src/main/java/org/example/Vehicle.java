package org.example;

public abstract class Vehicle {
    //Partie 1 getter / setter
    protected float currentGas;

    public float getCurrentGas() {
        return currentGas;
    }

    public void setCurrentGas(float currentGas) {
        this.currentGas = currentGas;
    }

    protected int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    protected float gasCapacity;

    public float getGasCapacity() {
        return gasCapacity;
    }

    public void setGasCapacity(float gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    protected float gasConsumption;

    public float getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(float gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    protected int passengerCapacity;

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    //Partie 2 méthodes
    public abstract void accelerate();

    public abstract void brake();

    public void refuel(int refuelQuantity) {

        if (currentGas < gasCapacity) {
            if ((refuelQuantity + currentGas) <= gasCapacity) {
                currentGas += refuelQuantity;
            } else {
                float wastedGas = currentGas + refuelQuantity - gasCapacity;
                System.out.println(String.format("Gaspille pas mon gars, tu vas devoir boire %d litres", wastedGas));
            }
        } else {
            System.out.println("Ton réservoir est déjà plein gros c***n !");
        }

    }

    public void drive() throws Exception {
        //try {

        float conso = (gasConsumption * speed) / 100;
        if (currentGas - conso >= 0) {
            accelerate();
            currentGas -= conso;
            System.out.println("Le véhicule a consommé : " + conso);
        } else {
            throw new Exception("Tu vas devoir pousser mon gars :( ");
        }

        //   } catch (Exception e) {
        // System.out.println(e);
        //  }
    }
}