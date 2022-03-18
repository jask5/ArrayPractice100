import java.util.*;



class Solution9 {
    public void solve(char[][] board) {
        //corner case
        if(board.length == 0) return;
        for(int i = 0; i < board[0].length; i++) {
            if(board[0][i] == 'O') //first row
                DFS(board, 0, i);
            if(board[board.length-1][i] == 'O') //last row 
                DFS(board, board.length-1, i);
        }
        
        //for border columns 
        for(int i = 0; i < board.length; i++) {
            if(board[i][0] == 'O')
                DFS(board, i, 0);
            if(board[i][board[0].length-1] == 'O')
                DFS(board, i, board[0].length-1);
        }
        
        //traversing each element inside the borders
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == '#') 
                    board[i][j] = 'O';
                else if(board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
      return;
    }
    
    
    //DFS method
    private void DFS(char[][] board, int i, int j) {
        //corner or out of bounds cases
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O')
            return;
        board[i][j] = '#';
        //traversing all the points above and below and on the sides of the point pointing to
        DFS(board, i+1, j);
        DFS(board, i-1, j);
        DFS(board, i, j+1);
        DFS(board, i, j-1);
    }
}

public class SurroundedRegion{
    public static void main(String[] args) {
        char[][] board ={{'X','X','X','X'},
        {'X','O','O','X'},
        {'X','X','O','X'},
        {'X','O','X','X'}
    };
        Solution9 s9 = new Solution9();
        s9.solve(board);
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

}