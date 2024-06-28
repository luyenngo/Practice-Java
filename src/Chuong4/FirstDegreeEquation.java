package Chuong4;

import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Number A: ");
        int a = scanner.nextInt();
        System.out.println("Input Number B: ");
        int b = scanner.nextInt();
        if (a==0) System.out.println("Equation with No value");
        else System.out.println("Result: " + -b/a);
    }
}
