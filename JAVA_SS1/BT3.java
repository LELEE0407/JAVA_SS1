// Xây dựng một ứng dụng tính toán chu vi và diện tích của 
// hình vuông, hiển thị kết quả ra màn hình

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập độ dài cạnh hình vuông từ người dùng
        System.out.print("Nhập độ dài cạnh hình vuông: ");
        int sideLength = sc.nextInt();
        // Đóng đối tượng Scanner sau khi đã nhập xong
        sc.close();

        // Tính chu vi của hình vuông
        int perimeter = 4 * sideLength;

        // Tính diện tích của hình vuông
        int area = sideLength * sideLength;

        System.out.println("Chu vi của hình vuông là: " + perimeter);
        System.out.println("Diện tích của hình vuông là: " + area);
    }
}
