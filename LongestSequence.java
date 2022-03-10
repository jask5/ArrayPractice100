import java.util.*;
import java.math.*;

class Solution9 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> nums_set = new HashSet<Integer>();
        for(int num : nums) {
            nums_set.add(num);
        }
        int max_sequence_length = 0;
        for(int i = 0; i < nums.length; i++) {
            int curr_nums = nums[i];
            int curr_sequence_length = 1;
        
        if(!nums_set.contains((curr_nums)-1)){
            while(nums_set.contains(curr_nums+1)){
                curr_nums += 1;
                curr_sequence_length += 1;
            }
        }
        max_sequence_length = Math.max(curr_sequence_length, max_sequence_length);

    }

        

    return max_sequence_length;

    }
}

public class LongestSequence {
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        int[] nums = {100,4,200,1,3,2};
        System.out.println(sol.longestConsecutive(nums));
    }
  
}