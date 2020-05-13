package com.company;

public class Main {

    public static void main(String[] args) {
        Zadanie10 Pierwszy = new Zadanie10();
        Zadanie10 Drugi = new Zadanie10(10);
        Zadanie10 Trzeci = new Zadanie10(15, 12);

        Pierwszy.wykonajOperacjeMatematycznaDodawanie();
        Drugi.wykonajOperacjeMatematycznaDodawanie(9);
        Trzeci.wykonajOperacjeMatematycznaDodawanie();
        Pierwszy.wykonajOperacjeMatematycznaMnozenie(11,22);
        Drugi.wykonajOperacjeMatematycznaMnozenie(79, 45);
        Trzeci.wykonajOperacjeMatematycznaMnozenie(1,1);

    }
}

class Zadanie10
{
    int a;
    int b;

    Zadanie10()
    {
        a = 0;
        b = 0;
    }

    Zadanie10(int y)
    {
        a = y;
        b = 0;
    }

    Zadanie10(int x, int y)
    {
        a = x;
        b = y;
    }


    void wykonajOperacjeMatematycznaDodawanie()
    {
        System.out.println(a + b);
    }

    void wykonajOperacjeMatematycznaDodawanie(int a)
    {
        System.out.println(a + b);
    }

    void wykonajOperacjeMatematycznaMnozenie(int a, int b)
    {
        System.out.println(a * b);
    }

}