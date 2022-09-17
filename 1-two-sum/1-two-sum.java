class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> m = new HashMap<>();
        int idx1 = -1;
        int idx2 = -1;
        
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            Integer pos = m.get(target-nums[i]);
            if(pos != null && pos!=i)
            {
                idx1 = i;
                idx2 = pos;
                break;
            }
        }
        
        int res[] = new int[2];
        res[0] = idx1;
        res[1] = idx2;
        return res;
    }
}