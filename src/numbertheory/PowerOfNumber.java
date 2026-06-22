package numbertheory;

/**
 * Power of a number using fast exponentiation (exponentiation by squaring).
 * Even exponent: x^n = (x^2)^(n/2)
 * Odd exponent : x^n = x * x^(n-1)
 * Cuts O(n) down to O(log n).
 */
public class PowerOfNumber {

    // Recursive fast exponentiation
    static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) { x = 1 / x; n = -n; }
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } else {
            return x * myPow(x, n - 1);
        }
    }

    // Iterative version - O(log n) time, O(1) space
    static double myPowIterative(double x, int n) {
        double result = 1;
        long exp = Math.abs((long) n);
        while (exp > 0) {
            if (exp % 2 == 1) result *= x;
            x *= x;
            exp /= 2;
        }
        return n < 0 ? 1 / result : result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, 10));         // 1024.0
        System.out.println(myPow(2, -2));         // 0.25
        System.out.println(myPow(3, 0));          // 1.0
        System.out.println(myPowIterative(2, 10)); // 1024.0
    }
}
