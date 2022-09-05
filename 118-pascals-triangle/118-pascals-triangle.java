class Solution {
    
    public List<List<Integer>> generate(int n) 
    {
        List<List<Integer>> res = new ArrayList<>();
        
        List<Integer> r1 = new ArrayList<>(); //row`1
        r1.add(1);
        res.add(r1);
        
        if(n==1)
            return res;
        
        for(int k=1;k<n;k++)
        {
            List<Integer> l = new ArrayList<>();
            l.add(1);
        
            for(int i=1;i<k;i++)
            {
                List<Integer> ll = res.get(k-1);
                l.add(ll.get(i-1) + ll.get(i));
            }
            l.add(1);

            res.add(l);
        }
       
     
        return res;    
    }
}