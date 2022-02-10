import java.util.*;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        k %= nums.length;
        if(k==0) return; //because if no rotation than the array will remain the same 
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length);
    }



    public static int[] reverse(int[] arr, int start, int end) {
        while(start<end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        return arr;
    }

}