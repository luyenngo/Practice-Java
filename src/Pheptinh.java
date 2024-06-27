import java.util.Scanner;

public class Pheptinh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        double tong = a+b;
        double tru = a-b;
        double nhan = a*b;
        double chia = a/b;

        System.out.println("Cộng: " + tong);
        System.out.println("Trừ: " + tru);
        System.out.println("Nhân: " + nhan);
        System.out.println("Chia: " + chia);





    }
}

