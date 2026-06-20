package numbertheory;

/**
 * Factorial of a number.
 * 0! = 1, 1! = 1, n! = n * (n-1)!
 * int overflows at 13!, long overflows at 21! - use BigInteger beyond that.
 */
public class Factorial {

    // Iterative - always preferred, O(1) stack space
    static long factorialIterative(int n) {
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return -1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    // Recursive - elegant but O(n) stack depth, risk of overflow for large n
    static long factorialRecursive(int n) {
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return -1;
        }
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorialIterative(0));  // 1
        System.out.println(factorialIterative(5));  // 120
        System.out.println(factorialIterative(10)); // 3628800
        System.out.println(factorialIterative(20)); // 2432902008176640000
        System.out.println(factorialRecursive(6));  // 720
        System.out.println(factorialIterative(-3)); // prints message, returns -1
    }
}
