public class Day6 {

    public static void main(String[] args) {
        
    }
    // Java
public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i == 0) return false;
    }
    return true;
}
// Java
public static String getGrade(int marks) {
    if      (marks >= 91) return "AA";
    else if (marks >= 81) return "AB";
    else if (marks >= 71) return "BB";
    else if (marks >= 61) return "BC";
    else if (marks >= 51) return "CD";
    else if (marks >= 41) return "DD";
    else                  return "Fail";
}
// Java — use long for big numbers
public static long factorial(int n) {
    if (n == 0 || n == 1) return 1;
    long result = 1;
    for (int i = 2; i <= n; i++) result *= i;
    return result;
}
// Java
public static boolean isPalindrome(int n) {
    if (n < 0) return false;
    int original = n, reversed = 0;
    while (n > 0) {
        int digit = n % 10;
        reversed  = reversed * 10 + digit;
        n         = n / 10;
    }
    return original == reversed;
}


}