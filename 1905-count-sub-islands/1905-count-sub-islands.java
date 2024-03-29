class Solution {
    
    int dirs[][] = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    
    public boolean dfs(int grid1[][], int grid2[][], int i, int j, int n, int m)
    {
        boolean ans=true;
        
        if(grid1[i][j] != grid2[i][j])
            ans=false;
        
        
        grid2[i][j] = 0;
        
        for(int dir[] : dirs)
        {
            int x = i + dir[0];
            int y = j + dir[1];
            
            if(x>=0 && y>=0 && x<n && y<m && grid2[x][y] == 1)
                ans = dfs(grid1, grid2, x, y, n, m) && ans;
        }
        
        return ans;
    }
    
    
    public int countSubIslands(int[][] grid1, int[][] grid2) 
    {
        int n = grid2.length;
        int m = grid2[0].length;
        int count = 0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid2[i][j]==1)
                {
                    boolean ans = dfs(grid1, grid2, i, j, n, m);
                    
                    if(ans)
                        count++;
                }
            }
        }
        
        return count;
    }
}