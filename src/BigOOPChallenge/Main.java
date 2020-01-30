package BigOOPChallenge;

public class Main {
    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("basic","sausage",3.50,"white ");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.14);
        hamburger.addHamburgerAddition2("cheese", 1.10);

        System.out.println("total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43); // calling from parent class
        healthyBurger.addHealthAddition1("Lentils", 5.43); //new health addition created in healthy burger
        System.out.println("Total healthy burger price is "+ healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        hamburger.addHamburgerAddition3("Wont be able to see this!! overridden method in deluxeBurger class", 0.14);
        db.itemizeHamburger();
    }
}
