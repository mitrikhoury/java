package oop.java_oop_advanced.car_and_driver;

class Car {
    private int gas;

    public Car() {
        this.gas = 10;
    }

    public void displayGas() {
        System.out.println("Gas remaining: " + gas + "/10");
    }

    public void checkGameOver() {
        if (gas <= 0) {
            System.out.println("Game over!");
        }
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

}
