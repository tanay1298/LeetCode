class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        Map<Integer, Integer> m = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
            m.put(nums[i],1);
        
        int max_val = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            int x = nums[i];
            int c = 0;
            
            Integer y = m.get(x);
            if(y>1 || y==-1)
                continue;
            
            while(m.get(x)!=null)
            {
                if(m.get(x)>1)
                {
                    c = c+m.get(x);
                    break;
                }
                c++;
                m.put(x,-1);
                x++;
            }
            max_val = Math.max(max_val, c);
            m.put(nums[i],c);
        }
        
        return max_val;
    }
}