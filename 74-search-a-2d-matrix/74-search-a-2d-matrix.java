class Solution {
    
    public boolean search(int[][]matrix, int i, int j, int target, int m, int n)
    {
        boolean res1 = false;
        boolean res2 = false;
        
        if(i>=0 && j<n)
        {
            int x = matrix[i][j];
            
            if(target == x)
                return true;
            
            if(target < x && j-1 >= 0)
            {
                System.out.print("less");
                res1 = search(matrix, i, j-1, target, m, n);
                if(res1 == true)
                    return true;                
            }
            
        
            if(target > x && i+1 < m)
            {
                System.out.print("more");
                res2 = search(matrix, i+1, j, target, m , n);
                if(res2 == true)
                    return true;
            }
        }
        
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) 
    {
       int m = matrix.length;
       int n = matrix[0].length; 
       int i = 0;
       int j = n-1; 
       int x = matrix[i][j];
       
        
        if(x==target)
            return true;
        
        boolean res = search(matrix, i, j, target, m , n);
        return res;
    }
}