import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        circle(r);

        double b = sc.nextDouble();
        double h = sc.nextDouble();
        triangle(b, h);

        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        rectangle(length, breadth);

        double base = sc.nextDouble();
        double height = sc.nextDouble();
        isosceles(base, height);

        double pbase = sc.nextDouble();
        double pheight = sc.nextDouble();
        parallelogram(pbase, pheight);

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        rhombus(d1, d2);

        double s = sc.nextDouble();
        equilateralTriangle(s);

        double radius = sc.nextDouble();
        circumference(radius);

        double si = sc.nextDouble();
        perimeter(si);

        double a = sc.nextDouble();
        double b1 = sc.nextDouble();
        perimeterParallelogram(a, b1);

        sc.close();
    }

    public static void circle(double r) {
        double area = Math.PI * r * r;
        System.out.printf("Area of Circle is : %.2f\n", area);
    }

    public static void triangle(double base, double height) {
        double area = 0.5 * base * height;
        System.out.printf("Area of Triangle is : %.2f\n", area);
    }

    public static void rectangle(double length, double breadth) {
        double area = length * breadth;
        System.out.printf("Area of Rectangle is : %.2f\n", area);
    }

    public static void isosceles(double base, double height) {
        double area = 0.5 * base * height;
        System.out.printf("Area of Isosceles Triangle is : %.2f\n", area);
    }

    public static void parallelogram(double base, double height) {
        double area = base * height;
        System.out.printf("Area of Parallelogram is : %.2f\n", area);
    }

    public static void rhombus(double d1, double d2) {
        double area = 0.5 * d1 * d2;
        System.out.printf("Area of Rhombus is : %.2f\n", area);
    }

    public static void equilateralTriangle(double side) {
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.printf("Area of Equilateral Triangle is : %.2f\n", area);
    }

    public static void circumference(double radius) {
        double peri = 2 * Math.PI * radius;
        System.out.printf("Perimeter of Circle is : %.2f\n", peri);
    }

    public static void perimeter(double side) {
        double peri = 3 * side;
        System.out.printf("Perimeter of Equilateral Triangle is : %.2f\n", peri);
    }

    public static void perimeterParallelogram(double a, double b) {
        double peri = 2 * (a + b);
        System.out.printf("Perimeter of Parallelogram is : %.2f\n", peri);
    }
}