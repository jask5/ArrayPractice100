import java.util.*;
import java.lang.*;


public class SpiralArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int r = 3;
        int c = 4;
        spirallyTraverse(matrix, r, c);
    }

    
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
    
    ArrayList<Integer> list = new ArrayList<>();
        int rowStart = 0; 
        int rowEnd = r-1;
        int colStart = 0;
        int colEnd = c-1;
        while((rowStart <= rowEnd) && (colStart <= colEnd)) {
            for(int col = colStart; col <= colEnd; col++) {
                System.out.println(matrix[rowStart][col]);
                list.add(matrix[rowStart][col]);
                
            }
            rowStart++;
            
            for(int row = rowStart; row <= rowEnd; row++) {
                System.out.println(matrix[row][colEnd]);
                list.add(matrix[row][colEnd]);
            }
            colEnd--;
            for(int col = colEnd; col >= colStart; col++) {
                System.out.println(matrix[rowEnd][col]);
                list.add(matrix[rowEnd][col]);
            }
            rowEnd--;
            for(int row = rowEnd; row <= rowStart; row++) {
                System.out.println(matrix[row][colStart]);
                list.add(matrix[row][colStart]);
            }
            colStart++;
            
        }
        System.out.println();
        return list;
        
    }  
    

}


