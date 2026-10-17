package Q69;

public class Q69_sol {
    public int mySqrt(int x) {
        long left = 0, right = (long) x + 1;
        while (left <= right - 1){
            long mid = (left + right) / 2;
            if (mid * mid == x)
                return (int) mid;
            else if (mid * mid > x)
                right = mid;
            else if (mid * mid < x)
                left = mid + 1;
        }
        return (int) left - 1;
    }
}
