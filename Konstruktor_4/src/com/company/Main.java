package com.company;

public class Main {

    public static void main(String[] args) {
        PrzykladPrzeciazanie Jeden = new PrzykladPrzeciazanie ();
        PrzykladPrzeciazanie Dwa = new PrzykladPrzeciazanie ();
        PrzykladPrzeciazanie Trzy = new PrzykladPrzeciazanie ();
        Jeden.wypisz(10);
        Dwa.wypisz(19.2);
        Trzy.wypisz("zadanie4");

    }
    
}

class PrzykladPrzeciazanie
{

    void wypisz(int a)
    {
        System.out.println("int: " + a);
    }

    void wypisz(double a)
    {
        System.out.println("double: " + a);
    }

    void wypisz(String a)
    {
        System.out.println("string: " + a);
    }
}
