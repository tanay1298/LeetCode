class Solution 
{
    List<List<Integer>> res = new ArrayList<>();
    
    public void rec(int[] nums,  int i, int n, List<Integer> al, boolean last_included)
    {
        if(i==n)
        {
            res.add(new ArrayList<>(al));
            return;
        }
        
        // include
        if(i>0 && nums[i] == nums[i-1] && last_included==false)
        {
            // do not include current
            rec(nums, i+1, n, al, false);
            return;
        }
        
        al.add(nums[i]);
        rec(nums, i+1, n, al, true);
        
        // not include
        al.remove(al.size()-1);
        rec(nums, i+1, n, al, false);
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        int i=0;
        int n = nums.length;
        List<Integer> al = new ArrayList<>();
        
        Arrays.sort(nums);
        
        boolean last_included = false;
        rec(nums, i, n, al, last_included);
        
        return res;   
    }
}