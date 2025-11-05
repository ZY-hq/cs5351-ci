package Samples;

public class FloorSquareRoot {
    // 计算整数x的floor平方根（小于等于x的最大整数平方根）
    public static int floorSqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 1, end = x, ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            // 避免mid*mid溢出（可选优化：用mid <= x/mid替代）
            if (mid <= x / mid) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("floorSqrt(" + x + ") = " + ans);
        return ans;
    }
}