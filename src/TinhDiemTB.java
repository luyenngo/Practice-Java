import java.util.Scanner;

public class TinhDiemTB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm môn học 1: ");
        double mon1 = scanner.nextDouble();

        System.out.print("Nhập điểm môn học 2: ");
        double mon2 = scanner.nextDouble();

        System.out.print("Nhập điểm môn học 3: ");
        double mon3 = scanner.nextDouble();

        // Tính điểm TB
        double diemTB = (mon1 + mon2 + mon3)/3;

        // Hiển thị kết quả
        System.out.println("Điểm trung bình của học sinh là: " + diemTB);

    }
}
