class Solution 
{
    List<List<Integer>> res = new ArrayList<>();
    
    public void rec(int[] nums,  int i, int n, List<Integer> al)
    {
        if(i==n)
        {
            if(!res.contains(al))
                res.add(new ArrayList<>(al));
            
            return;
        }
        
        // include
        al.add(nums[i]);
        rec(nums, i+1, n, al);
        
        // not include
        al.remove(al.size()-1);
        rec(nums, i+1, n, al);
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        int i=0;
        int n = nums.length;
        List<Integer> al = new ArrayList<>();
        
        Arrays.sort(nums);
        rec(nums, i, n, al);
        
        return res;   
    }
}