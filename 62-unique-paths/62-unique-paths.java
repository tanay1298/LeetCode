class Solution {
    
    // recursion
    public int fn(int i, int j, int m, int n, int dp[][])
    {
        if(i>=m || j>=n)
            return 0;
        
        if(i==m-1 && j==n-1)
            return 1;
        
        // already calculated
        if(dp[i][j] != -1)
            return dp[i][j];
        
        return dp[i][j] = fn(i+1, j, m , n, dp) + fn(i, j+1, m, n, dp);
    }
    
    public int uniquePaths(int m, int n) 
    {
        int dp[][] = new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
                dp[i][j] = -1;
        }
        return fn(0, 0 , m , n, dp);
    }
}