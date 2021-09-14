/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int i = 1;
        double temp = 0;

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        String convert = in.nextLine();

        while (i == 1){
            System.out.println("Your choice: "+convert.toUpperCase());
            if(convert.equalsIgnoreCase("C")){
                System.out.print("Please enter the temperature in Fahrenheit: ");
                temp = in.nextDouble();

                double c = Math.round(((temp-32.0)*(5.0/9.0))*100.0)/100.0;

                System.out.println("The temperature in Celsius is "+c);

                i = 0;
            }
            else if(convert.equalsIgnoreCase("F")){
                System.out.print("Please enter the temperature in Celsius: ");
                temp = in.nextDouble();

                double f = Math.round((temp*(9.0/5.0)+32)*100.0)/100.0;

                System.out.println("The temperature in Fahrenheit is "+f);

                i = 0;
            }
            else{
                System.out.println("Please enter C or F.");
                convert = in.nextLine();
            }
        }
    }
}
