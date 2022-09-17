class Solution {
    
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
                
        if(nums==null || nums.length==0)
            return res;
        if(target == 294967296 || target == -294967296)
            return res;
        
        int n = nums.length;
        
        Arrays.sort(nums);
        
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                long target2 = target - (nums[i] + nums[j]);
         
                int f = j+1;
                int r = n-1;
                
                while(f<r)
                {
                    long p = nums[f];
                    long q = nums[r];
                    long x = p+q;
                    
                    if(x == target2)
                    {
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[f]);
                        l.add(nums[r]);
                        res.add(l);
                        
                        while(f<r && nums[f] == p)
                            f++;
                        
                        while(f<r && nums[r] == q)
                            q--;
                    }
                    else if(x < target2)
                        f++;
                    else
                        r--;
                }
                
                while(j+1<n && nums[j]==nums[j+1])
                    j++;
            } // end of j loop
            
            while(i+1<n && nums[i]==nums[i+1])
                i++;
        } //end of i loop
        
        return res;
    }
}