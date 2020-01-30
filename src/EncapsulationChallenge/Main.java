package EncapsulationChallenge;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50,5, false);
        printer.fillToner(20);

        System.out.println(printer.getPagesPrinted());
    }
}
