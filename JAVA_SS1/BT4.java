
// Chương trình chúng ta sẽ cần nhập vào 3 giá trị tương đương 
// với 3 điểm môn học (Toán, Văn, Anh) sau đó tỉnh tổng trung bình 
// cộng ba điểm và hiển thị trên màn hình
import java.text.DecimalFormat;
import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập điểm môn Toán từ người dùng
        System.out.print("Nhập điểm môn Toán: ");
        float mathScore = sc.nextFloat();

        // Nhập điểm môn Văn từ người dùng
        System.out.print("Nhập điểm môn Văn: ");
        float literatureScore = sc.nextFloat();

        // Nhập điểm môn Anh từ người dùng
        System.out.print("Nhập điểm môn Anh: ");
        float englishScore = sc.nextFloat();

        sc.close();

        float average = (mathScore + literatureScore + englishScore) / 3;

        // Làm tròn số trung bình về 1 chữ số thập phân
        DecimalFormat df = new DecimalFormat("#.#");
        String formattedAverage = df.format(average);

        System.out.println("Tổng điểm trung bình của 3 môn là: " + formattedAverage);
    }
}
