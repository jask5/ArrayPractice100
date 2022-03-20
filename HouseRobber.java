import java.util.*;


class Solution4 {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] dp = new int[nums.length]; //max money robbed till that point 
        dp[0] = nums[0];
        dp[1] = nums[1];
        for(int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }


        return dp[nums.length-1];
    }
}




public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,9,3,1};
        Solution4 sol = new Solution4();

        System.out.println(sol.rob(nums));
    }
    
}
