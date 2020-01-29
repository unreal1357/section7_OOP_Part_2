package CompositionChallenge;

public class MainTwo {

    public static void main(String[] args) {

        Bed bed = new Bed("king size",4,20,1);
        Room theRoom =new Room(4,"4",bed);
        House theHouse = new House(theRoom);

        theHouse.enterRoom();
        theRoom.makeBed();

    }



}
