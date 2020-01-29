package Encapsulation;

public class Player {

//    without using encapsulation, when changing a field in here it all needs to be changed in main too
    public String fullName;
//    might forget to initialize when changing fields from the class it belongs
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;

        if(this.health <= 0) {
            System.out.println("Player knocked out");
//            reduce number of lives remaining for the player
        }
    }

    public int healthRemaning() {
        return this.health;
    }
}
