class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            boolean[] rowcheck=new boolean[9];
            boolean[] colcheck=new boolean[9];
            boolean[] subboxcheck=new boolean[9];
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') {}
                else if(rowcheck[board[i][j]-'1']) return false;
                else rowcheck[board[i][j]-'1']=true;
                
                if(board[j][i]=='.') {}
                else if(colcheck[board[j][i]-'1']) return false;
                else colcheck[board[j][i]-'1']=true;
                        
                int n=i/3*3+j/3;
                int m=i%3*3+j%3;
                if(board[n][m]=='.') {}
                else if(subboxcheck[board[n][m]-'1']) return false;
                else subboxcheck[board[n][m]-'1']=true;
            }
        }
            return true;
    }
}