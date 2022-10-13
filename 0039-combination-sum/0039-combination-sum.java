class Solution 
{
    
    public void rec(int[] arr, int idx, int target, List<List<Integer>> res, List<Integer> l)
    {
        if(idx == arr.length)
        {
            if(target == 0)
                res.add(new ArrayList<>(l));
            return;
        }
        
        // include
        if(arr[idx] <= target)
        {
            l.add(arr[idx]);
            rec(arr, idx, target-arr[idx], res, l);
            l.remove(l.size()-1);
        }
        
        // not include
        rec(arr, idx+1, target, res, l);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        int idx = 0;
        List<List<Integer>> res = new ArrayList<>();
        rec(candidates, idx, target, res, new ArrayList<>());
        
        return res;
    }
}