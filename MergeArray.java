import java.util.Arrays;

public class MergeArray {
    //merging two arrays after comparing them
    private int[] mergeArrays(int[] arr1, int[] arr2){
        //function to take the two arrays 
        //index of arr1, arr2 & merged array
        
        
        //can include two check cases in case if the one of the array entered is empty 
        //considering this case if input taken from users
        if(arr1 == 0) {
            return arr2;
        }
        if(arr2 == 0) {
            return arr1;
        }
        
        
        

        int i = 0, j = 0, k = 0;
        
        //merged array length
        int mergedArrayLength = arr1.length + arr2.length;

        //merged array 
        int[] mergedArray = new int[mergedArrayLength];
        

        //checking elements in both the arrays and adding smaller ones first 
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;

        }

        //for the elements that are left (if any) 
        while(i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
    

public static void main(String[] args) {
    
    MergeArray arrays = new MergeArray(); //object of class MergeArray 
    int[] arr3 = arrays.mergeArrays(new int[] {0,3,4,31}, new int[] {4, 6, 30});
    System.out.println(Arrays.toString(arr3));
}
}
