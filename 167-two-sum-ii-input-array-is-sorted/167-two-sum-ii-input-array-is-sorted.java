class Solution {
    
    public int[] twoSum(int[] nums, int target) 
    {
        int si = 0;
        int ei = nums.length-1;
        int cs = 0;
        
        while(si<ei)
        {
            cs = nums[si]+nums[ei];
            
            if(cs<target)
                si++;
            else if(cs>target)
                ei--;
            else
                return new int[]{si+1, ei+1};
                    
        }
        
        
        return new int[]{};
        
    }
}