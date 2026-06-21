package numbertheory;

/**
 * GCD and LCM using the Euclidean algorithm.
 * gcd(a, b) = gcd(b, a % b), repeated until b == 0.
 * LCM = (a / gcd) * b - always divide before multiplying to avoid overflow.
 */
public class GCDAndLCM {

    // Iterative GCD - no stack overflow risk
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Recursive GCD - cleaner, mention stack depth tradeoff
    static int gcdRecursive(int a, int b) {
        return b == 0 ? a : gcdRecursive(b, a % b);
    }

    // LCM - divide first to prevent overflow
    static long lcm(int a, int b) {
        return (long) a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        System.out.println("GCD(48,18) = " + gcd(48, 18));   // 6
        System.out.println("GCD(0,5) = " + gcd(0, 5));       // 5
        System.out.println("LCM(4,6) = " + lcm(4, 6));       // 12
        System.out.println("LCM(12,18) = " + lcm(12, 18));   // 36
    }
}