package numbertheory;

/**
 * Perfect number: sum of proper divisors equals the number itself.
 * Example: 6 = 1 + 2 + 3
 * Uses sqrt(n) trick - for each divisor i, also add n/i, skip when i == n/i.
 */
public class PerfectNumber {

    static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 1; // 1 always divides n

        for (int i = 2; (long) i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum == n;
    }

    static void printPerfectInRange(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (isPerfect(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(isPerfect(6));   // true
        System.out.println(isPerfect(28));  // true
        System.out.println(isPerfect(12));  // false
        printPerfectInRange(10000);          // 6 28 496 8128
    }
}
