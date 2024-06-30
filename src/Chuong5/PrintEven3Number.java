package Chuong5;

import java.util.Scanner;

public class PrintEven3Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input N:");// do while
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i+=2) {
            if (i % 4 ==0) {
                System.out.println(-i + "\t");
            }else {
                System.out.println(i + "\t");
            }
        }

    }
}
