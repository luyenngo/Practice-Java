package Chuong4;

import java.util.Scanner;

public class CompareTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Number A: ");
        int a = scanner.nextInt();
        System.out.println("Input Number B: ");
        int b = scanner.nextInt();
        if (a>b) System.out.println("Max: " + a + " and " + "Min: " + b);
        else if (a<b) System.out.println("Max: " + b + " and " + "Min: " + a);
        else  System.out.println("Value a equal b");
    }
}
