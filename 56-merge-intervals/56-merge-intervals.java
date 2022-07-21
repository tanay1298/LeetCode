class Solution {
    public int[][] merge(int[][] intervals) 
    {
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); 
        
        int res[][] = new int[intervals.length][2];
        int k=0;
        int n = intervals.length;
        int start_pos = intervals[0][0];
        int end_pos = intervals[0][1];
        
        int i = 1;
        
        while(i<n)
        {
            
            if(end_pos >= intervals[i][0])
            {
                end_pos = Math.max(intervals[i][1], end_pos);  
            }
            else
            {
                res[k][0] = start_pos;
                res[k][1] = end_pos;
                start_pos = intervals[i][0];
                end_pos = intervals[i][1];
                k++;
            }
           i++;
        }
        
        res[k][0] = start_pos;
        res[k][1] = end_pos;
        k++;
        
        int[][] final_res = Arrays.copyOfRange(res, 0, k);   
        
        return final_res;
    }
}   