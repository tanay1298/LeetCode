class Solution 
{
    
    public double myPow(double x, int n) 
    {
        if(n==0)
            return 1;
        
        if(x==1)
            return 1;
        
        if(x == -1)
        {
            if(n%2==0)
                return 1;
            else
                return -1;
        }
        
        if(n == -2147483648)
            return 0;
        
        if(n < 0)
        {
           n = -n;
           x = 1/x; 
        }
 
        double xnb2 = myPow(x, n/2);
        double xn = xnb2 * xnb2;    
        
        if(n%2 == 1)
            xn = x * xn;
        
        return xn;
    }
}