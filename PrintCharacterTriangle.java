package com.company;

import java.util.Scanner;

/**
 * Created by Pavilion on 3/12/2016.
 */
public class PrintCharacterTriangle {
    public static void main(String[]args) {
        Scanner console = new Scanner(System.in);
        int i = console.nextInt();
        for (int j = 0; j < i; j++) {
            char c = 'a';
            for (int k = 0; k < j+1; k++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
        for (int j = i-1; j > 0; j--) {
            char c = 'a';
            for (int k = j; k > 0; k--) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
