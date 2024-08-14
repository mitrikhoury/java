package oop.java_oop_advanced.car_and_driver;

class Driver extends Car {

    public void drive() {
        if (super.getGas() > 0) {
            super.setGas(getGas() - 1 );
            System.out.println("You drive the car.");
            displayGas();
             checkGameOver();
        } else {
            checkGameOver();
        }
    }

    public void boost() {
        if (super.getGas() >= 3) {
            super.setGas(getGas() - 3 );
            System.out.println("You use boosters.");
            displayGas();
            checkGameOver();
        } else {
            System.out.println("Not enough gas to use boosters.");
            displayGas();
        }
    }

    public void refuel() {
        if (super.getGas() <= 8) {
            super.setGas(getGas() + 2 );
            System.out.println("You refuel the car.");
            displayGas();
        } else {
            System.out.println("Gas level too high to refuel.");
            displayGas();
        }
    }
}
