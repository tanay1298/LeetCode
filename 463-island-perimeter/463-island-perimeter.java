class Solution 
{
    public int islandPerimeter(int[][] grid) 
    {
        int n = grid.length;
        int m = grid[0].length;
        
        int dirs[][] = {{0,1}, {1,0}, {0,-1}, {-1,0}}; 
        int ans = 0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    int nbrs = 0;
                    
                    for(int[] dir : dirs)
                    {
                        int x = i+dir[0];
                        int y = j+dir[1];
                        
                        if(x>=0 && x<n && y>=0 && y<m &&grid[x][y]==1)
                            nbrs++;
                    }
                    
                    ans += (4-nbrs);
                }
                
            }
        }
        
        return ans;
    }
}