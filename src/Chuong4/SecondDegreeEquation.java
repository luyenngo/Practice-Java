package Chuong4;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SecondDegreeEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Number A: ");
        double a = scanner.nextDouble();
        System.out.println("Input Number B: ");
        double b = scanner.nextDouble();
        System.out.println("Input Number C: ");
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;

        // ax^2 + bx + c = 0
        if (a == 0) {
            if (b == 0) {
                System.out.println("Equation has no solution");
            } else {
                System.out.println("Result: " + -c / b);
            }
        } else {
            if (delta == 0) {
                System.out.println("Result: " + -b / (2 * a));
            } else if (delta > 0) {
                double x1 = (-b - sqrt(delta)) / (2 * a);
                double x2 = (-b + sqrt(delta)) / (2 * a);
                System.out.println("Result 1: " + x1);
                System.out.println("Result 2: " + x2);
            } else {
                System.out.println("Equation has no real solution");
            }
        }
    }
}
