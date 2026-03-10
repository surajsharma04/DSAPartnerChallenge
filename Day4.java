import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Perimeter of Rectangle
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.println(2 * (length + breadth));

        // 2. Perimeter of Square
        int side = sc.nextInt();
        System.out.println(4 * side);

        // 3. Perimeter of Rhombus
        int sideRhombus = sc.nextInt();
        System.out.println(4 * sideRhombus);

        // 4. Volume of Prism
        int baseArea = sc.nextInt();
        int height = sc.nextInt();
        System.out.println(baseArea * height);

        // 5. Volume of Cylinder
        int r = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(Math.PI * r * r * h);

        // 6. Volume of Sphere
        int radius = sc.nextInt();
        System.out.println((4.0 / 3) * Math.PI * radius * radius * radius);

        // 7. Volume of Pyramid
        int baseAreaPyramid = sc.nextInt();
        int heightPyramid = sc.nextInt();
        System.out.println((baseAreaPyramid * heightPyramid) / 3);

        // 8. Curved Surface Area of Cylinder
        int r2 = sc.nextInt();
        int h2 = sc.nextInt();
        System.out.println(2 * Math.PI * r2 * h2);

        // 9. Total Surface Area of Cube
        int cubeSide = sc.nextInt();
        System.out.println(6 * cubeSide * cubeSide);

        // 10. Fibonacci Series up to n numbers
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();

        // 11. Subtract Product and Sum of Digits
        int num = sc.nextInt();
        int product = 1;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            sum += digit;
            num /= 10;
        }

        System.out.println(product - sum);

        sc.close();
    }
}