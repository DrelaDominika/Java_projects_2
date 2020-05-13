package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ile liczb chcesz podac?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double[] arr = new double[n];
        double total = 0;

        for(int i=0; i<arr.length; i++){
            System.out.print("Wpisz liczbe no. "+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }

        double average = total / arr.length;

        System.out.format("Srednia tych liczb wynosi: %.3f", average);
    }
}

