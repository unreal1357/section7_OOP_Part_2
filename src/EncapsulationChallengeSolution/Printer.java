package EncapsulationChallengeSolution;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {

        if(tonerLevel>-1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else{
            this.tonerLevel = -1; //way to show its set incorrectly (use -1)
        }

        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerLevel > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount; //*****i should have used += in my attempt!*****
            return this.tonerLevel;
        } else {
            return -1; //returning validation status this means something has gone wrong
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex){
//            (pages/= 2) + (pages % 2); this prevents number of pages being printed if its an odd number
//            the above doesnt seem to print correctly though when i use it...
            pagesToPrint = pages/= 2;
            System.out.println("printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
