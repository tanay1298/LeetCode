class Solution {
    
    public int uniquePaths(int m, int n) 
    {
        int dp[][] = new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                // Starting from cell [m - 1][n - 1] has 2 options: up and left.
                // If you arrive at m == 0 that means that the only way you can go is left
                // that means that you have only 1 option to get there Similar for n == 0.
                if(i==0 || j==0)
                    dp[i][j] = 1;
                
                // either go left or up
                else
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        
        return dp[m-1][n-1];
    }
}