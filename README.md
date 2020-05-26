# Java_projects_1
My second repository that focuses on learning the basics of Java.

## Table of contents
* [General info](#general-info)
* [Setup](#setup)
* [Code Examples](#code-examples)
* [Status](#status)
* [Inspiration](#inspiration)
* [Contact](#contact)

## General info
This repository is a continuation of my programming journey in Java created in IntelliJ - IDE. 

## Setup
You can download the tool mentioned here: https://www.jetbrains.com/idea/download/#section=windows

The Java Development Kit which u can find here: https://www.oracle.com/java/technologies/javase-jdk11-downloads.html will alse be required.

## Code Examples
One of the codes which focuses on classes and objects.

```package com.company;

public class Main {

    public static void main(String[] args) {
        Punkt Pierwszy = new Punkt(10,20);
        Punkt Drugi = new Punkt(4,20);
        Pierwszy.wyswietlWspolrzedne();
        Drugi.wyswietlWspolrzedne();
        Linia Pierwsza = new Linia(Pierwszy,Drugi);
        Pierwsza.toString();
    }
}

class Punkt
{
    int x;
    int y;

    Punkt(int wspX,int wspY)
    {
        x = wspX;
        y = wspY;
    }


    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void wyswietlWspolrzedne() {
        System.out.println("Punkt: (" + x +","+ y + ")");

    }
}


class Linia
{
    int a, b, c, d;
    Punkt poczatek;
    Punkt koniec;
    Linia(Punkt start, Punkt end)
    {
        poczatek = start;
        koniec = end;
    }
    Linia(int a, int b, int c, int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
```


## Status
Most projects which you can find here are finished. Some are still being corrected, some will be added soon.

## Inspiration
Prejects are based on the book "Thinking in Java" written by Bruce Eckel.

## Contact
Created by [@DrelaDominika] - feel free to contact me!

