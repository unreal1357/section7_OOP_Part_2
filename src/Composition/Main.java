package Composition;

//using composition rather than inheritance
public class Main {

    public static void main(String[] args) {

//        case definition, creating  case
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220b", "Dell", "240w",dimensions);

//        creating a monitor
//        creating an instance of a class without a variable --- using "new resolution"
        Monitor theMonitor = new Monitor("27 beast","Acer",27, new Resolution(2540, 1440));

//        creating motherboard
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",4,6,"v2.44");

//        making a PC object with the above objects created and insertinng all there data into thePC
        PC thePC = new PC(theCase,theMonitor,theMotherboard);

//        how to access methods from monitor class using "thePC"
//        thePC.getMonitor().drawPixelAt(1500,1200,"red");
//        thePC.getMotherboard().loadProgram("Spotify");
//        thePC.getTheCase().pressPowerButton();

//        powerup method runs the  public press power button from case and then the private method to draw the logo
        thePC.powerUp();

    }
}
