
// leet code N-Queen Problem
class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> res = new ArrayList<List<String>>();
        char[][] board = new char[n][n];
        for(int i = 0; i < board.length; i++){
            for(int ii = 0; ii < board.length; ii++){
                // System.out.print(board[i][ii]);
                board[i][ii] = '.';
            }
            // System.out.println();
        }
        int queenNum = 0;
        place(board, 0, res, queenNum);
        
        return res;
    }
    
    public void place(char[][] board, int row, List<List<String>> result, int n){
        if( row >= board.length) return;
        for(int col = 0; col < board.length; col++){
            if(valid(board, row, col)){
                // System.out.println(row + " : " + col);
                // place if valid
                board[row][col] = 'Q';
                n += 1;
                if( n == board.length) {
                    // System.out.println("YTES");
                    ArrayList<String> b = new ArrayList<String>();
                    for(int i = 0; i < board.length; i++){
                        b.add(new String(board[i]));
                    }
                    result.add(b);
                    // return;
                }
                // for(int i = 0; i < board.length; i++){
                //     for(int ii = 0; ii < board.length; ii++){
                //         System.out.print(board[i][ii]);
                //     }
                //     System.out.println();
                // }
                // System.out.println();
                place(board, row + 1, result, n);
                board[row][col] = '.';
                n -= 1;
            }
        }
        
        
    }
    
    public boolean valid(char[][] board, int x, int y){
        
        // check column
        for(int row = 0; row < board.length; row++){
            if(board[row][y] == 'Q') return false;
        }
        
        for(int row = x, col = y; row >= 0 && col >= 0; row--,col--){
            // System.out.println(row + " : " + col);
            if(board[row][col] == 'Q') return false;
        }
        
        // System.out.println("test");
        for(int row = x, col = y; row >= 0 && col < board.length; row--, col++){
            // System.out.println(row + " : " + col);
            if(board[row][col] == 'Q') return false;
        }
            
            return true;
    }
}
