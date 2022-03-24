import java.util.*;


class Solution3 {
    public int longestSubsequence(int[] nums) {
        if(nums.length <=1) {
            return nums.length;
        }
        int longest = -1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1); //initially filling dp array with 1

        for(int i = 1; i < nums.length; i++){ // starting from 1 cause will be checking previous elements 
            for(int j = 0; j < i; j++) { //longest till i
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            
            for(int num : dp) {
                longest = Math.max(longest, num);
            }

        }
        return longest; 
    }
} 

public class LIS {
public static void main(String[] args) {
    Solution3 sol3 = new Solution3();
    int[] nums = {10,9,2,5,3,7,101,18};
    int length = sol3.longestSubsequence(nums);
    System.out.println(length);
}

    
}
