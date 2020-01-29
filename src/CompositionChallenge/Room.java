package CompositionChallenge;

public class Room {
    private int windows;
    private String lights;
    private Bed bed;

    public Room(int windows, String lights, Bed bed) {
        this.windows = windows;
        this.lights = lights;
        this.bed = bed;
    }

    public void openDoor(){
        System.out.println("opening the door");
    }

    public void lightsOn(int lights){
        System.out.println("Turning on the lights");
    }

    public void makeBed() {
        System.out.println("Bedroom -> making bed");
        bed.make();
    }
}
