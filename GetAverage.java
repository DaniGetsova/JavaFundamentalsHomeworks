package com.company;

import java.util.Scanner;

/**
 * Created by Pavilion on 3/13/2016.
 */
public class GetAverage {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double b = Double.parseDouble(console.nextLine());
        double c = Double.parseDouble(console.nextLine());
        double result = getAverage(a,b,c);
        System.out.printf ("%.2f", result);
    }
    public static double getAverage (double a, double b, double c) {
        double result = (a+b+c)/3;
        return result;
    }
}
