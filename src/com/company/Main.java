package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x");
        double x = sc.nextDouble();
        System.out.println("Input y");
        double y = sc.nextDouble();
        double R = 4.0;
        double r;
        r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (r <= R) {
            System.out.println("The point belongs to the circle.");
        } else {
            System.out.println("The point doesn't belong to the circle.");
        }
        System.out.println(r);
    }
}
