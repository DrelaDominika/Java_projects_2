package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Podaj cyfre: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " jest parzysta");
        else
            System.out.println(num + " jest nieparzysta");
    }
}
