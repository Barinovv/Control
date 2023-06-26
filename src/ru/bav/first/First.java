package ru.bav.first;

import java.util.Scanner;

public class First {
    public static double geron(double a, double n) {
        double x = 0.5 * (n + a / n);
        return x;
    }
    public static double result(double a) {
        double n = 1;
        double x;
        double d = 0.000000000000001;
        while (Math.abs(geron(a, n) - n) > d) {
            x = (geron(a, n));
            n = x;
        }
        return n;
    }
}
