class Solution 
{
    public List<List<String>> partition(String s) 
    {
        List<String> l = new ArrayList<>();
        List<List<String>> res = new ArrayList<>();
        int index = 0;
        
        rec(s, 0, l, res);
        return res;
    }
    
    
    public void rec(String s, int index, List<String> l, List<List<String>> res)
    {
        if(index == s.length())
        {
            res.add(new ArrayList<>(l));
            return;
        }
        
        for(int i=index;i<s.length();i++)
        {
            if(isPali(s, index, i))
            {
                l.add(s.substring(index, i+1));
                // rec call for substring
                rec(s, i+1, l, res);
                l.remove(l.size()-1);
            }
        }
    }
    
    
    
    public boolean isPali(String s, int start, int end)
    {
        while(start <= end)
        {
            if(s.charAt(start) != s.charAt(end))
                return false;
            
            start++;
            end--;
        }
        return true;
    }
}