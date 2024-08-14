package oop.java_oop_advanced.Zookeeper;

public class Bat extends Mammal{
    
    public Bat() {
       super.setEnergyLevel(300);
    }

    public void fly(){
        if(super.getEnergyLevel() > 0){
            System.out.println("The bat takes off with a whoosh");
            super.setEnergyLevel(getEnergyLevel() - 50);
        } else{
            System.out.println("no energy for fly :( ");
        }
    }

    public void eatHumans(){
        System.out.println("The bat has eaten a human!");
        super.setEnergyLevel(getEnergyLevel() + 25);
    }

    public void attackTown(){
        if(super.getEnergyLevel() > 0){
            System.out.println("The town is on fire!");
            super.setEnergyLevel(getEnergyLevel() - 100);
        } else{
            System.out.println("no energy for attack :( ");
        }
       
    }

}
