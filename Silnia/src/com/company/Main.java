package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe dla ktorej chcesz obliczyc silnie: ");
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println("Silnia " + n + " to " + result);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
3