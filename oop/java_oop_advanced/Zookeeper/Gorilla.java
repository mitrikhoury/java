package oop.java_oop_advanced.Zookeeper;

public class Gorilla extends Mammal {
    
    public void throwSomething(){
        if(super.getEnergyLevel() >0){
            System.out.println("The gorilla has thrown something!");
            super.setEnergyLevel(getEnergyLevel() - 5);
        } else {
            System.out.println(" no energy for throw any thing :( ");
        }
       
    }

    public void eatBananas(){
        System.out.println("The gorilla is satisfied after eating bananas!");
        super.setEnergyLevel(getEnergyLevel() + 10);
    }

    public void climb(){
        if(super.getEnergyLevel() > 0 ){
            System.out.println("The gorilla has climbed a tree!");
            super.setEnergyLevel(getEnergyLevel() - 10);
        } else{
            System.out.println(" no energy for climb :( ");
        }
       
    }
}
