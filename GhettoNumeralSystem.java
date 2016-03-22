package com.company;

import java.util.Scanner;

/**
 * Created by Pavilion on 3/12/2016.
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner console = new Scanner( System.in);
        String input = console.nextLine();
        char [] numbers = input.toCharArray();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            String ghetto;
            switch(numbers[i]) {
                case '0': ghetto="Gee"; break;
                case '1': ghetto="Bro"; break;
                case '2': ghetto="Zuz"; break;
                case '3': ghetto="Ma"; break;
                case '4': ghetto="Duh"; break;
                case '5': ghetto="Yo"; break;
                case '6': ghetto="Dis"; break;
                case '7': ghetto="Hood"; break;
                case '8': ghetto="Jam"; break;
                case '9': ghetto="Mack"; break;
                default: ghetto="Error";
            }
            output.append(ghetto);
        }
        System.out.println(output);
    }
}
