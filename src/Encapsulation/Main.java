package Encapsulation;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//
//        player.name = "Jon";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaning());
//
//
//        damage = 11;
//        //        without using encapsulation can do stuff like which is taking control out of the player class
////        being able to access the fields directly can cause issues
////        better to control using a constructor
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("remaining health = " + player.healthRemaning());

//        health has to be between 1 and 100, set to 100 by default i think
//        more control
        EnhancedPlayer player = new EnhancedPlayer("Jon", 80, "Sword");
//        cannot use player.health now, have to use the getter - this means cannot change the player health any more --> example of encapsulation
        System.out.println("initial health is " + player.getHitpoints());

    }
}
