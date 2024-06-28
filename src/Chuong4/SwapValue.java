package Chuong4;

import java.util.Scanner;

public class SwapValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Number A: ");
        int a = scanner.nextInt();
        System.out.println("Input Number B: ");
        int b = scanner.nextInt();
        int t = a;
        a = b;
        b = t;
        System.out.println("New value of a: " + a);
        System.out.println("New value of b: " + b);
    }
}
