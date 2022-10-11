class Solution 
{
    
    public void rec(int[] nums,  int i, int n, List<Integer> al, List<List<Integer>> res)
    {
        if(i==n)
        {
            if(!res.contains(al))
                res.add(new ArrayList<>(al));
            
            return;
        }
        
        // include
        al.add(nums[i]);
        rec(nums, i+1, n, al, res);
        
        // not include
        al.remove(al.size()-1);
        rec(nums, i+1, n, al, res);
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        int i=0;
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        
        Arrays.sort(nums);
        rec(nums, i, n, al, res);
        
        return res;   
    }
}