// phát triển một ứng dụng Java cho phép nhập tên của người dùng từ bàn phím,
//  sau đó hiển thị lời chào kèm theo tên của người đó.

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String a = new Scanner(System.in).nextLine();
        System.out.println("Hello: " + a);
    }
}
