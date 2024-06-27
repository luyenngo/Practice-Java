import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập năm sinh của bạn: ");
        int tuoi = scanner.nextInt();

        // Tính tuổi
        int hientai = 2024;
        int tinhtuoi = hientai - tuoi;

        System.out.println("Tuổi của bạn là: " + tinhtuoi);
    }
}
