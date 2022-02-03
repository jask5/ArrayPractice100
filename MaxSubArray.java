import java.util.*;
import java.lang.*;
import java.io.*;

class GlobalMax {
public long maxSubArray(int[] arr, int n) {
    
    n = arr.length;
    long localMax = 0;
    long globalMax = Integer.MIN_VALUE;
    for(int i = 0; i < n; i++) {
        localMax = Math.max(arr[i], arr[i] + localMax);
        if(localMax > globalMax) {
            globalMax = localMax;
        }
    }
    return globalMax;

}

}
public class MaxSubArray {
    public static void main(String[] args) {

        //taking array from users 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
        }

        GlobalMax gb = new GlobalMax();
        long maxSub = gb.maxSubArray(arr, n);

        System.out.println("Max subarray is: " + maxSub);

        
    }
    
    
}
