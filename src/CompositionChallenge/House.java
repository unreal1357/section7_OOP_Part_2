package CompositionChallenge;

public class House {

    private Room theRoom;

    public House(Room theRoom) {
        this.theRoom = theRoom;
    }

    public void enterRoom(){
        theRoom.openDoor();
        lights();
    }

    private void lights() {
        theRoom.lightsOn(1);
    }
}
