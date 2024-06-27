import java.util.Scanner;

public class CVDTHinhTron {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Vui lòng nhập bán kình hình tròn");
        double r = scanner.nextDouble();

        double chuvi = 2 * pi * r;
        double dientich = pi * r * r;
        //Tinh chu vi
        System.out.println("Chu vi hình tròn là:" + chuvi);
        System.out.println("Diện tích hình tròn là:" + dientich);


    }
}
