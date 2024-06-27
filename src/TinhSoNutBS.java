import java.util.Scanner;

public class TinhSoNutBS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập biển số xe:");
        String carnumber = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < carnumber.length(); i++) {
            char characters = carnumber.charAt(i);
            if (Character.isDigit(characters)) {
                sum += Character.getNumericValue(characters);
            }

        }
        // Lấy số nut hàng đơn vị
        int sumdv = sum % 10;

        System.out.println("Tổng số nút là: " + sum);
        System.out.println("Tổng số nút hàng đơn vị là: " + sumdv);

    }
}

