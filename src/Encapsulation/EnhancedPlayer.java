package Encapsulation;

public class EnhancedPlayer {

//    making these variables/fields private is making sure that this class in not accessible to any outside classes
//    using encapsulation
    private String name;
    private int hitpoints = 100;
    private String weapon;

//    guranteeing that name, health and weapon are initialized when the class is created.
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
//        only accepting a value between 1 and 100 for health int variable
        if (health > 0 && health <= 100){
            //    this still works, can make changes to field names and change them and the main code will still work!!! because the return is changed very cool is this
            this.hitpoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitpoints = this.hitpoints - damage;

        if(this.hitpoints <= 0) {
            System.out.println("Player knocked out");
//            reduce number of lives remaining for the player
        }
    }

    public int getHitpoints() {

        return hitpoints;
    }
}
