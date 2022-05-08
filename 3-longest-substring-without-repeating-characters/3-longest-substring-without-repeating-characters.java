class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int si=0;
        int ei=0;
        int count=0;
        int ans=0;
        
        int freq[] = new int[128];
        
        while(ei<s.length())
        {
            if(freq[s.charAt(ei)]==1)
                count++;
            
            freq[s.charAt(ei)]++;;
            ei++;
            
            // correct the window
            while(count>0)
            {
                if(freq[s.charAt(si)]==2)
                    count--;
                
                freq[s.charAt(si)]--;
                si++;     
            }
            
            if(ans < ei-si) // length of window (si, ei-1)
                ans = ei-si;   
        }
        
        return ans;
    }
} 