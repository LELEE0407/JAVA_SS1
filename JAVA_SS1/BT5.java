// Nhập vào bán kính đường tròn và thực hiện 
// tính toán chu vi và diện tích của đường tròn
// Để tính chu vi dùng công thức: 2 * pi * r
// Để tính diện tích công thức: pi * r * r
// Với r là bán kính đường tròn

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính đường tròn: ");
        double radius = sc.nextDouble();
        sc.close();

        // Tính chu vi của đường tròn
        double perimeter = 2 * Math.PI * radius;

        // Tính diện tích của đường tròn
        double area = Math.PI * radius * radius;

        DecimalFormat df = new DecimalFormat("#.##");
        String formattedPerimeter = df.format(perimeter);
        String formattedArea = df.format(area);

        System.out.println("Chu vi của đường tròn là:" + formattedPerimeter);
        System.out.println("Diện tích của đường tròn là:" + formattedArea);
    }
}
