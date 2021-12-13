package com.extra.temperature;

public class TemperatureConvertor {
    static final float CALC_FAHRENHEIT = 1.8f;
    static final float CALC_KELVIN = 273.15f;
    static final float CALC_REAUMUR = 0.8f;
    static final float CALC_RANKINE = 491f;

    static float calculaFahrenheit(float celsius) {
        float fahrenheit = (celsius * CALC_FAHRENHEIT) + 32f;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        return fahrenheit;
    }

    static float calculaReamur(float celsius) {
        float reaumur = celsius * CALC_REAUMUR;
        System.out.println("A temperatura em Reamur é: " + reaumur);
        return reaumur;
    }

    static float calculaKelvin(float celsius) {
        float kelvin = celsius + CALC_KELVIN;
        System.out.println("A temperatura em Kelvin é: " + kelvin);

        return kelvin;
    }
    static float calculaRankine(float celsius) {
        float rankine = (celsius * CALC_FAHRENHEIT) + CALC_RANKINE;
        System.out.println("A temperatura em Rankine é: " + rankine);

        return rankine;
    }

}
