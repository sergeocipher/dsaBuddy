package subsets;

public class Solution1 {
    public int SubsetSum(int[] A, int B) {
        return helper(A, B, 0L, 0); 
    }

    private static int helper(int[] nums, int target, long sum, int index) {
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }

        int x = helper(nums, target, sum + nums[index], index + 1);

        int y = helper(nums, target, sum, index + 1);

        return x + y;
    }
}
