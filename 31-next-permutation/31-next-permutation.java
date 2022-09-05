class Solution {
    public void nextPermutation(int[] nums) 
    {
        int pos = -1;
        int n = nums.length;
        
        for(int i=n-1;i>0;i--)
        {
            if(nums[i] <= nums[i-1])
                continue;
            else
            {
                pos = i-1;
                break;
            }
        }        
        
        if(pos == -1)
        {
            // reverse nums
            int i=0;
            int j=n-1;
            
            while(i<=j)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            return;
        }
        
        int res[] = new int[n];
        int min_pos = pos+1;
        
        for(int j=pos+1;j<n;j++)
        {
            if(nums[j] > nums[pos] && nums[j]<=nums[min_pos])
                min_pos = j;
        }
        
                
        int temp = nums[pos];
        nums[pos] = nums[min_pos];
        nums[min_pos] = temp;
        
        // reverse from pos+1 to n-1
        
        int i=pos+1;
        int j=n-1;
        
        while(i<=j)
        {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
        
    }
}