import java.util.*;
//space is O(1) and time complexity is O(NlogN)
class Solution {
    public boolean containDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}


public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
           
        }
        Solution s = new Solution();
        boolean value = s.containDuplicate(nums);
        System.out.println("Value is: "+ value);

        
    }
    
}
