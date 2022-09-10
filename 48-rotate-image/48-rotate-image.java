class Solution {
    
    public void rotate(int[][] matrix) 
    {
        int n = matrix.length;
        int m = matrix[0].length;
        
        // transpose
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // reverse all rows
        for(int i=0;i<n;i++)
        {
            int q = 0;
            int w = n-1;
            
            while(q<w)
            {
              int temp = matrix[i][q];
              matrix[i][q] = matrix[i][w];
              matrix[i][w] = temp; 
              q++;
              w--;
            }
        }
        
    }
}