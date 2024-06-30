package Chuong5;

import java.util.Scanner;

/**
 * In dãy số 1, 3, 5, 7, 9 … n (n là số nhập vào từ bàn phím)
 */
public class PrintOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input N:");// do while
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i+=2) {
//            if (i %2 == 1) {
                System.out.print(i + "\t");
//            }
        }
    }
}

