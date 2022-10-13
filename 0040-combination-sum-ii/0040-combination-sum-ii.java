class Solution 
{
    
    public void rec(int[] arr, int idx, int target, List<List<Integer>> res, List<Integer> l, boolean last_included)
    {
        if(idx == arr.length)
        {
            if(target == 0)
                res.add(new ArrayList<>(l));
            return;
        }
        
        // include
        if(idx > 0 && arr[idx] == arr[idx-1] && last_included==false)
        {
            // not including current
            rec(arr, idx+1, target, res, l, false);
            return;
        }
        
        if(arr[idx] <= target)
        {
            l.add(arr[idx]);
            rec(arr, idx+1, target-arr[idx], res, l, true);
            l.remove(l.size()-1);
        }
        
        // not include
        rec(arr, idx+1, target, res, l, false);
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        Arrays.sort(candidates);
        
        // 1 2 2 5 6 7 10
        
        List<List<Integer>> res = new ArrayList<>();
        boolean last_included = false;
        rec(candidates, 0, target, res, new ArrayList<Integer>(), last_included);
        
        return res;
    }
}