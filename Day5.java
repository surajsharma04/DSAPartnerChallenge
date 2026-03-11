import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palindrome(n);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = gcd(a, b);
        int lcm = (a * b) / hcf;
        System.out.println("Hcf of " + a + " and " + b + " is : " + hcf);
        System.out.println("Lcm of " + a + " and " + b + " is : " + lcm);
        char c = sc.next().charAt(0);
        isVowel(c);
        int x = sc.nextInt();
        perfectNumber(x);
        int year = sc.nextInt();
        leapyear(year);
        int num = sc.nextInt();
        sum(num);
        System.out.println(evenDaysInAugust());
        int[] arr = { -5, 4, -2, 7, 10, 3 };
        findSums(arr);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        printMax(a1, b1, c1);
        printMin(a1, b1, c1);
        int s = sc.nextInt();
        checkEvenOdd(s);
        int age = sc.nextInt();
        System.out.println(canVote(age));
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sum(num1, num2);
        sumNumbers();
        sc.close();
    }

    public static void palindrome(int n) {
        int x = n;
        int rev = 0;
        while (x > 0) {
            int ld = x % 10;
            rev = rev * 10 + ld;
            x = x / 10;
        }
        System.out.println((n == rev) ? "palindrome" : "not a palindrome");
    }

public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

  public static void isVowel(char c) {
    c = Character.toLowerCase(c);
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        System.out.println("Vowel");
    } else {
        System.out.println("Consonant");
    }
}

   public static void perfectNumber(int x) {
    int sum = 0;
    for (int i = 1; i <= x / 2; i++) {
        if (x % i == 0) {
            sum += i;
        }
    }
    System.out.println(sum == x ? "perfect number" : "not a perfect number");
}

    public static void leapyear(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        System.out.println("Leap year");
    } else {
        System.out.println("Not a leap year");
    }
}

  public static void sum(int n) {
    int original = n;
    int ans = 0;
    while (n > 0) {
        int ld = n % 10;
        ans += ld;
        n /= 10;
    }
    System.out.println("Sum of digits of " + original + " is : " + ans);
}

    public static int evenDaysInAugust() {
        int days = 31;
        int count = 0;
        for (int i = 1; i <= days; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void findSums(int[] arr) {
        int negSum = 0;
        int posEvenSum = 0;
        int posOddSum = 0;
        for (int num : arr) {
            if (num < 0) {
                negSum += num;
            } else if (num > 0 && num % 2 == 0) {
                posEvenSum += num;
            } else if (num > 0 && num % 2 != 0) {
                posOddSum += num;
            }
        }
        System.out.println("Sum of negative numbers: " + negSum);
        System.out.println("Sum of positive even numbers: " + posEvenSum);
        System.out.println("Sum of positive odd numbers: " + posOddSum);
    }

    public static void printMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Maximum: " + max);
    }

    public static void printMin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("Minimum: " + min);
    }

    public static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static boolean canVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sumNumbers() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum = " + sum);

    }

}