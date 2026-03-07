import java.util.Scanner;

class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numberCheck(n);
        sc.nextLine();
        String name = sc.nextLine();
        greet(name);
        long p = sc.nextInt();
        int t = sc.nextInt();
        float r = sc.nextFloat();
        simpleIntrest(p, t, r);
        sc.nextLine();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String op = sc.next();
        result(num1, num2, op);
        int x = sc.nextInt();
        int y = sc.nextInt();
        largest(x, y);
        int rupees = sc.nextInt();
        currencyConverter(rupees);
        int a = sc.nextInt();
        fibonacci(a);
        sc.nextLine();
        String str = sc.nextLine();
        palindrome(str);
        int start = sc.nextInt();
        int end = sc.nextInt();
        armstrong(start, end);
        sc.close();

    }

    public static void numberCheck(int n) {
        if (n % 2 == 0) {
            System.out.println("number " + n + "is even");
        } else {
            System.out.println("number " + n + "is odd");
        }
    }

    public static void greet(String name) {
        System.out.println("Hello " + name + ", welcome to the DSA Challenge!");
    }

    public static void simpleIntrest(long principal, int time, float roi) {
        float si =  (principal * time * roi) / 100;
        System.out.println(si);
    }

    public static void result(int num1, int num2, String s) {
        if (s.equals("+")) {
            System.out.println(num1 + num2);
        }
        if (s.equals("-")) {
            System.out.println(num1 - num2);
        }
        if (s.equals("*")) {
            System.out.println(num1 * num2);
        }
        if (s.equals("/")) {
            System.out.println(num1 / num2);
        }
    }

    public static void largest(int x, int y) {
        if (x > y) {
            System.out.println("the largest number is: " + x);
        } else {
            System.out.println("the largest number is: " + y);
        }
    }

    public static void currencyConverter(int rupees) {
        double usd = rupees / 91.93;
        System.out.println(usd);
    }

    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void palindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("Not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("palindrome");
    }

    public static void armstrong(int start, int end) {
        for (int i = start; i <= end; i++) {
            int n = i;
            int prod = 0;
            while (n > 0) {
                int ld = n % 10;
                prod += ld * ld * ld;
                n = n / 10;
            }
            if (prod == i) {
                System.out.print(i + " ");
            } else {
                continue;
            }
        }
    }

}