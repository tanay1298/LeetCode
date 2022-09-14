class Solution {
    
    public List<Integer> majorityElement(int[] nums) 
    {
        int m1 = -1;
        int c1 = 0;
        int m2 = -1;
        int c2 = 0;
        int n = nums.length;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == m1)
                c1++;
            else if(nums[i] == m2)
                c2++;
            else if(c1 == 0)
            {
                m1 = nums[i];
                c1=1;
            }
            else if(c2 == 0)
            {
                m2 = nums[i];
                c2=1;
            }
            else
            {
                c1--;
                c2--;
            }    
        }
        
        // m1,m2 can be probable majority elements
        
        int f1=0, f2=0;
        
        for(int x : nums)
        {
            if(x == m1)
                f1++;
            else if(x == m2)
                f2++;
        }
        
        List<Integer> l = new ArrayList<>();        
        
        if(f1 > n/3)
            l.add(m1);
        
        if(f2>n/3)
            l.add(m2);
        
        return l;
    }
}