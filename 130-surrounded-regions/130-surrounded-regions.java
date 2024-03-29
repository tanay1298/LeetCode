class Solution {
    
    int dirs[][] = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    
    public void dfs(int i, int j, char board[][], int n, int m)
    {
        board[i][j] = '$';
        
        for(int dir[] : dirs)
        {
            int x = i + dir[0];
            int y = j + dir[1];
        
            if(x>=0 && y>=0 && x<n && y<m && board[x][y]=='O')
                dfs(x, y, board, n, m); 
        }
    }
    
    
    public void solve(char[][] board) 
    {
        int n = board.length;
        int m = board[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==m-1)
                {
                    if(board[i][j]=='O')
                        // boundary condition : not surrounded, covert to '$'
                        dfs(i, j, board, n, m);
                }
            }
        }
        
        
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                 if(board[i][j]=='O') // surrounded
                    board[i][j]='X';
                 else if(board[i][j]=='$') // not surrounded
                    board[i][j]='O';
            }
        }
        
    }
}