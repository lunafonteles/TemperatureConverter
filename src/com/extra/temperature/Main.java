package com.extra.temperature;

public class Main {
    public static void main(String[] args) {
        String index = "";

        while (index != "s") {
            float celsius = Reader.readCelsius();
            index = Reader.indexConvertor();

            switch (index) {
                case "1":
                    TemperatureConvertor.calculaFahrenheit(celsius);
                    break;
                case "2":
                    TemperatureConvertor.calculaReamur(celsius);
                    break;
                case "3":
                    TemperatureConvertor.calculaRankine(celsius);
                    break;
                case "4":
                    TemperatureConvertor.calculaKelvin(celsius);
                    break;
                case "s":
                    System.exit(0);

                default:
                    System.out.println("Digite uma opçao válida");
            }

        }
    }
}
