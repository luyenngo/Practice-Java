package Chuong5;

import java.util.Scanner;

/**
 * In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
 */

public class PrintNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input N:");// do while
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
                System.out.print(i+ "/t");
            }
        System.out.print(n);
    }

}
