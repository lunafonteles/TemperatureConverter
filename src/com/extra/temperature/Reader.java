package com.extra.temperature;

import java.util.Scanner;

public class Reader {
    public static float readCelsius() {
        String message = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva a temperatura em Celsius");
        float celsius = scanner.nextFloat();
        if (celsius < 18) {
            message = "Está frio hoje!";
        } else if (celsius > 25) {
            message = "Está quente hoje!";
        } else {
            message = "Hoje a temperatura está ideal!";
        }

        System.out.println(message);
        return celsius;
    }

    static String indexConvertor () {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Para qual temperatura quer converter? %n1 - Fahrenheit, 2 - Reamur, 3 - Rankine, 4 Kelvin, s Sair %n");
        String index = scanner.next();
        return index;
    }

}
