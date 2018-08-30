package com.company;

public class Printer {

    private int tonerLevel;
    private int NoOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter)
    {
        if (tonerLevel>-1&&tonerLevel<=100)
        {
        this.tonerLevel=tonerLevel;

        }
        else {
            this.tonerLevel =-1;
        }
        this.duplexPrinter = duplexPrinter;
        this.NoOfPagesPrinted = 0;
    }
    public int AddToner(int tonerLevel, int tonerAmount)
    {
        if (tonerAmount>-1 && tonerAmount<=100)
        {
            if (tonerLevel+tonerAmount>100)
            {
                return  -1;
            }
             this.tonerLevel+=tonerAmount;
        return this.tonerLevel;
        }
        else return -1;
    }

    public int PrintPages(int Pages)
    {
        int pagesToPrint = Pages;
        if (this.duplexPrinter)
        {
            pagesToPrint= (pagesToPrint/2)+ (pagesToPrint%2);
            System.out.println("Printing in duplex mode");
        }
        this.NoOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNoOfPagesPrinted ()
    {
        return NoOfPagesPrinted;
    }

}
