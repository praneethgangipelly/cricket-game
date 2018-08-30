package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

Printer printer = new Printer(70,false);

        System.out.println("Initial Page count is "+printer.getNoOfPagesPrinted());
        int PagesPrinted = printer.PrintPages(9);
        System.out.println("Pages printed was " +PagesPrinted + " New count is "+printer.getNoOfPagesPrinted());
    PagesPrinted = printer.PrintPages(10);
        System.out.println("Pages printed was " +PagesPrinted + " New count is "+printer.getNoOfPagesPrinted());
    }
}
