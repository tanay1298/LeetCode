class Solution {
    
    boolean check(int weights[], int mid, int days)
    {
        int current_day = 0;
        int current_weight = 0;
        int total_days = 0;
        
        for(int i=0;i<weights.length;i++)
        {
            int w = weights[i];
            
            if(current_weight+w > mid)
            {
                total_days++;
                current_weight = w;
            }   
            else
                current_weight += w;
            
            if(total_days > days)
                return false;
        }
        
        if(current_weight>0)
            total_days++;
        
        return total_days <= days;
    }
    
    public int shipWithinDays(int[] weights, int days) 
    {
        int si = -1;
        int ei = 0;
        int ans = 0;
        
        for(int x : weights)
        {
            si = Math.max(x,si);
            ei += x;
        }
        
        while(si <= ei)
        {
            int mid = (si+ei)/2;
            
            boolean res = check(weights, mid, days);
            
            if(res)
            {
                ans = mid;
                ei = mid-1;
            }
            else
                si = mid+1;
        }
        
        return ans;
        
    }
}