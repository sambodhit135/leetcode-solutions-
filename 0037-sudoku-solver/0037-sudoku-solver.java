class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char board[][])
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char ch='1';ch<='9';ch++)
                    {
                        if(isSafe(i,j,board, ch))
                        {
                            board[i][j]=ch;

                            if(solve(board))
                            {
                                return true;
                            }
                             board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSafe(int row,int col,char board[][],char ch)
    {
        for(int i=0;i<9;i++)
        {
            if(board[i][col]==ch)
            {
                return false;
            }
        }

        for(int i=0;i<9;i++)
        {
            if(board[row][i]==ch)
            {
                return false;
            }
        }
        
        int startrow = (row / 3) * 3;
        int startcol = (col / 3) * 3;
        for(int i=startrow;i<startrow+3;i++)
        {
            for(int j=startcol;j<startcol+3;j++)
            {
                if(board[i][j]==ch)
                {
                    return false;
                }
            }
        }
        return true;
    }
}