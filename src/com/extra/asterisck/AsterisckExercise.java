package com.extra.asterisck;

import java.util.Scanner;

public class AsterisckExercise {
    public static void main (String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um numero");
        number = scanner.nextInt();

        for (int i =0; i<number; i++) {
            System.out.println("*");
        }
    }
}
