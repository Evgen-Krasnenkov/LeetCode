/**
 * https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/
 */
public class MinLimitBallsInBag {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = 1;
        for (int num:nums) {
            right = Math.max(right, num);
        }
        while (left < right){
            int mid = left + (right - left) / 2;
            int maxOperationCount = 0;

            for (int num:nums) {
                maxOperationCount += (num - 1) / mid;
            }
            if (maxOperationCount <= maxOperations){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        MinLimitBallsInBag minLimitBallsInBag = new MinLimitBallsInBag();
        minLimitBallsInBag.minimumSize(new int[]{2, 4, 8, 2}, 4);
    }
}
