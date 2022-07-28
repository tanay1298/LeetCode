class Solution {
    public int findDuplicate(int[] nums) {
        
        
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
 
        for (int x : nums) 
        {
            Integer j = hm.get(x);
            
            if(j!=null && j==1)
                return x;
            
            hm.put(x, (j == null) ? 1 : j + 1);
        }
        
        return -1;
    }
}