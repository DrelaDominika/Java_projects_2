package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladDwa Pierwszy = new PrzykladDwa();
        PrzykladDwa Drugi = new PrzykladDwa(12);
        PrzykladDwa Trzeci = new PrzykladDwa(12, 10);
        Pierwszy.wypisz();
        Drugi.wypisz();
        Trzeci.wypisz();

    }
}


class PrzykladDwa
{
    double prawdziwy;
    double wyimaginowany;

    PrzykladDwa()
    {
        prawdziwy = 0;
        wyimaginowany = 0;
    }

    PrzykladDwa(int a)
    {
        prawdziwy = a;
        wyimaginowany = 0;
    }

    PrzykladDwa(int x, int y)
    {
        prawdziwy = x;
        wyimaginowany = y;
    }

    void wypisz()
    {
        System.out.println(prawdziwy + " i " + wyimaginowany );
    }
}
