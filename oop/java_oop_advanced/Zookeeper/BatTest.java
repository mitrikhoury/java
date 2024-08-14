package oop.java_oop_advanced.Zookeeper;

public class BatTest {
    
    public static void main(String[] args) {
        
        Bat bat = new Bat();
        
        bat.displayEnergy(); // 300/300 
        bat.attackTown();
        bat.attackTown();
        bat.attackTown(); 

         bat.displayEnergy();  // 0 /300

        bat.eatHumans();
        bat.eatHumans();  

         bat.displayEnergy();  // 50/300 

        bat.fly();
        bat.fly();

        bat.displayEnergy();

    }
}
