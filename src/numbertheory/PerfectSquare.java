package numbertheory;

/**
 * Perfect square check.
 * Never compare Math.sqrt(n) directly due to floating point precision -
 * always verify by squaring the integer result back.
 */
public class PerfectSquare {

    // Simple method - cast and verify
    static boolean isPerfectSquareSimple(int n) {
        if (n < 0) return false;
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    // Binary search method - no floating point involved at all
    static boolean isPerfectSquareBinarySearch(long n) {
        if (n < 0) return false;
        if (n <= 1) return true;
        long lo = 1, hi = n / 2;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long sq = mid * mid;
            if (sq == n) return true;
            else if (sq < n) lo = mid + 1;
            else hi = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquareSimple(25));               // true
        System.out.println(isPerfectSquareSimple(26));               // false
        System.out.println(isPerfectSquareBinarySearch(2147395600L)); // true
    }
}