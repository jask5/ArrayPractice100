import java.util.*;
import java.lang.*;

class Solution1 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i : nums) {
            minHeap.add(i);
            if(minHeap.size() > k) {
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }


}
    
public class KthLargest {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        Solution1 s1 = new Solution1();
        int j = s1.findKthLargest(nums, k);
        System.out.println(j); 
    }
}
