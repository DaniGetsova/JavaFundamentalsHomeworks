package com.company;

import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i = Integer.parseInt(console.nextLine());
        int sum = 0;
        for (int j = 0; j <= i; j++) {
            sum +=j;
        }
        System.out.println(sum);
    }
}
