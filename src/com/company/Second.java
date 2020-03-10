package com.company;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x");
        double x = sc.nextDouble();
        System.out.println("Input y");
        double y = sc.nextDouble();
        double ax = 0;
        double ay = 0;
        double bx = 4;
        double by = 4;
        double cx = 6;
        double cy = 1;
        double f, l, k;
        f = (x - ax) * (by - ay) - (y - ay) * (bx - ax);
        l = (x - bx) * (cy - by) - (y - by) * (cx - bx);
        k = (x - cx) * (ay - cy) - (y - cy) * (cx - ax);
        if (f >= 0 && l >= 0 && k >= 0) {
            System.out.println("Point is in triangle");
        } else {
            System.out.println("Point is NOT in triangle");
        }

    }
}
