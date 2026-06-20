package numbertheory;

/**
 * Digit-level operations: sum of digits, count of digits, digital root.
 * Note: 0 has exactly 1 digit, not 0 - common off-by-one trap.
 */
public class DigitOperations {

    static int sumOfDigits(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int countDigits(int n) {
        if (n == 0) return 1; // edge case
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Digital root - repeated digit sum until single digit, O(1) formula
    static int digitalRoot(int n) {
        if (n == 0) return 0;
        return 1 + (n - 1) % 9;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345)); // 15
        System.out.println(countDigits(9999));  // 4
        System.out.println(countDigits(0));     // 1
        System.out.println(digitalRoot(9875));  // 2
        System.out.println(digitalRoot(18));    // 9
    }
}
