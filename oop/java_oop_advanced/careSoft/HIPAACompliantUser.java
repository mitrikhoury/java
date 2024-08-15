package oop.java_oop_advanced.careSoft;

public interface HIPAACompliantUser {

    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
    
}
