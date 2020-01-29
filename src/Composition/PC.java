package Composition;

//composition example

//creating a PC class that a case, monitor, and motherboard with the "theCase", "monitor", "motherboard" variables
//dont have to use extends here, in this case PC comprises of these 3 other classes (case,monitor,motherboard)
//

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
//        fancy graphics
        monitor.drawPixelAt(1200,50,"yellow");
    }
}
