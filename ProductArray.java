import java.util.*;

class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] output_array = new int[N];

        output_array[0] = 1;

        for(int i = 1; i < nums.length; i++) {
            output_array[i] = nums[i-1] * output_array[i-1];

        }

        int R = 1;
        for(int i = N-1; i >= 0; i--) {//left array * right array 
            output_array[i] = output_array[i] * R;
            R = R * nums[i];
        }

        return output_array;
    }
}


public class ProductArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Solution2 sol2 = new Solution2();
        int[] arr = sol2.productExceptSelf(nums);

        for(int i = 0; i < nums.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    
}
