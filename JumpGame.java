package JK.company;
import java.util.*;

//Greedy Approach
class Solution3 {
    public boolean canJump(int[] nums) {
        int lastIndex = nums.length-1;
        for(int i = nums.length-1; i >= 0; i--) {
            if(nums[i] + i >= lastIndex) {
                lastIndex = i;

            }
        }

        return lastIndex == 0;

    }
}

public class JumpGame {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int[] arr = {2, 3, 1, 1, 4};
        System.out.println(sol.canJump(arr));
    }


}
