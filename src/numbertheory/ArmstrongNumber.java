package numbertheory;

/**
 * Armstrong (narcissistic) number.
 * Sum of each digit raised to the power of total digit count equals the number.
 * Example: 153 = 1^3 + 5^3 + 3^3 = 153
 */
public class ArmstrongNumber {

    static boolean isArmstrong(int n) {
        if (n < 0) return false;
        int original = n, sum = 0;

        int digits = 0, temp = n;
        while (temp > 0) { digits++; temp /= 10; }
        if (n == 0) digits = 1;

        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == original;
    }

    static void printArmstrongInRange(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (isArmstrong(i)) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // true
        System.out.println(isArmstrong(370)); // true
        System.out.println(isArmstrong(123)); // false
        printArmstrongInRange(0, 500);        // 0 1 2 3 4 5 6 7 8 9 153 370 371 407
    }
}