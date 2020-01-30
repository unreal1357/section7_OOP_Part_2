package EncapsulationChallenge;

//could add if pages are duplex then number of pages printed is x 2
public class Printer {

//    simulate a real printer

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {

        if(tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int addToner) {
        this.tonerLevel = this.tonerLevel + addToner;
        System.out.println("New toner level is: " + tonerLevel);
    }

    public int getPagesPrinted(int pagesPrinted){
        this.pagesPrinted = this.pagesPrinted;
        System.out.println(pagesPrinted + " Pages have been printed");
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
