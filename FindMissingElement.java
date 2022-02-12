import java.util.*;
import java.io.*;


public class FindMissingElement {
   public static int findMissingNumber(int[] arr, int n) {
       
       int sum_range = (n/2)*(n+1);
       
       for(int i = 0; i < arr.length; i++) {
           sum_range -= arr[i];}
           return sum_range;
       }


   public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,8,9,10};
       int n = 10; //range given by user 
       System.out.println(findMissingNumber(arr, n));
   }
    
}
