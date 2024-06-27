import java.util.Scanner;

public class TinhThue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vui lòng nhập giá sản phẩm:");
        int Gia = scanner.nextInt();

        System.out.print("Vui lòng nhập tỷ lệ VAT:");
        double Tyle = scanner.nextInt();

// Công thức tính: Tiền thuế VAT = Giá sản phẩm * (Tỷ lệ VAT / 100)
        double TiềnVAT = Gia * (Tyle/100);
        System.out.print("Vui lòng nhập tỷ lệ VAT:" + TiềnVAT);

    }
}
