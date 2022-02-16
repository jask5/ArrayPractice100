package JK.company;
import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }



        int counter = 1;

        //no of iterations
        while(counter < n-1) {
            for(int i = 0; i < n-counter; i++) { //counter because at the end of one iteration we'll get biggest no
                //on rightmost side of array
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
                counter++;

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
