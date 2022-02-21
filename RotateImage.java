package JK.company;
import java.util.*;
class Solution1 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }


        //System.out.println();

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

    }
}



public class RotateImage {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
       s1.rotate(array);

    }
}
