package com.bridgelabz.JUnit;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {
    public static void main(String[] args) {
        Utility utility = new Utility();
        System.out.println("Enter 1 to convert from Celcius to fahrenheit::");
        System.out.println("Enter 2 to convert from fahrenheit to Celcius::");
        int choice = utility.getIntValue();
        double temperature = 0.0;
        double converted = 0.0;
        if (choice == 1) {
            System.out.println("Enter the temperature in celcius::");
            temperature = utility.getIntValue();
            converted = 9 / 5.0 * temperature + 32;

            System.out.println("Temperature in fahrenheit::" +converted);
        } else if (choice == 2) {
            System.out.println("Enter the temperature in fahrenheit::");
            temperature = utility.getIntValue();

            converted = 5 / 9.0 * (temperature - 32);
            System.out.println("Temperature in Celcius::" +converted);
        }else{
            System.out.println("Wrong input.......please try again!!!!!");

        }
    }
}
