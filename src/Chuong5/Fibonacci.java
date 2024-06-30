package Chuong5;

import java.util.Scanner;

/**
 * In dãy số Fibonacci từ 0 đến n
 * fn = f1 + f2
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input N:");// do while
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Khong co so nao");
        } else {
            int a = 0;
            int b = 1;
            System.out.println(a + " ");
            // day fibo 0,1,1,2,3,...
            // n = 3 -> 0,1,1 ->
            // n = 5 -> 0,1,1,2,3
            if (n > 1) {
                System.out.println(b + " ");
                for (int i = 3; i <= n; i++) {
                    int fn = a + b;
                    System.out.println(fn + " ");
                    a = b;
                    b = fn;
                    //i=3 bd a=0; b=1 > fn = 1; a = 1; b = 1
                    //i=4 bd a=1; b=1  =>fn = 2; a = 1; b=2
                    //i=5 bd a=1; b=2 => fn =3; a=2; b=3
                    //i=6 -> out vongf lap
                    //0 1 1 2 3
                }
            }

        }
    }
}

