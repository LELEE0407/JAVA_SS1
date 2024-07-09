// Xây dựng một ứng dụng chuyển đổi tiền tệ, cho phép tính giá trị
//  tiền VNĐ dựa trên một tỉ giá cho trước và giá trị tiền USD được nhập vào.

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        long exchangeRate = 25000L;

        // Nhập giá trị tiền USD từ người dùng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD cần chuyển đổi: ");
        Long usdAmount = sc.nextLong();
        sc.close();

        // Tính giá trị tương ứng trong VNĐ
        long vndAmount = usdAmount * exchangeRate;
        System.out.println(usdAmount + " USD = " + vndAmount + " VND");
    }
}