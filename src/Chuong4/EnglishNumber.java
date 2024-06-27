package Chuong4;

import java.util.Scanner;

public class EnglishNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Number: ");
        int i = scanner.nextInt();
        String[] numberEnglish = {"one","two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        //trong array mỗi giá trị có index đánh dấu từ 0 -> n
        if(i>0 && i<=10){
            System.out.println("Number "+i+" is "+ numberEnglish[i-1]);
        } else {
            System.out.println("Input again");
        }
    }
}
