import java.util.*;
import java.io.*;


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        // Base case; first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        System.out.println(triangle);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            System.out.println(row);
            List<Integer> prevRow = triangle.get(rowNum-1);
            System.out.println(prevRow);

            // The first row element is always 1.
            row.add(1);
            System.out.println(row);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
                System.out.println(row);
            }

            // The last row element is always 1.
            row.add(1);
            System.out.println(row);

            triangle.add(row);
            System.out.println(triangle);
        }

        return triangle;
    }
}

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        Solution s1 = new Solution();
        s1.generate(numRows);
        //System.out.println(s1.generate(numRows));
        
    }
}