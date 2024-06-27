package Chuong4;

import java.util.Scanner;

public class BooleanCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean a = true && false;//false
        boolean b = (3 > 100) || (25 % 5 == 0);//true
        boolean c = a && b;//false && true -> false
        boolean d = !a || b;

        System.out.println("Value c: " + c);
        System.out.println("Value d: " + d);
    }
}
