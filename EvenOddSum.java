import java.io.*;


public class EvenOddSum {
    public static void main(String[] args) {


   
    int even = 0, odd = 0;
    int[] arr = {1,2,3,4,5,6};
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] % 2 == 0) { //or i%2 == 0 for index locations 
            even += arr[i];
        } else {
            odd += arr[i];
        }
    }

    System.out.println(even);
    System.out.println(odd);

} 
}
