// Given two numbers represented by two different arrays A and B. The task is to find the sum array. The sum array is an array representation of addition of two input arrays.

// Example 1:

// Input:
// N = 3, M = 3
// A[] = {5, 6, 3}
// B[] = {8, 4, 2}
// Output: 1 4 0 5
// Explanation: As 563 + 842 = 1405.
// Example 2:

// Input:
// N = 6, M = 4 
// A[] = {2, 2, 7, 5, 3, 3}
// B[] = {4, 3, 3, 8}
// Output: 2 3 1 8 7 1
// Explanation: As 227533 + 4338 = 231871

class Solution {
    ArrayList<Integer> findSum(int a[], int b[]) {
       
        ArrayList <Integer>res = new ArrayList<Integer>();
        
        int i = a.length-1;
        int j = b.length-1;
        int carry = 0;   

        while(i>=0 || j>=0 || carry>0)
        {
            int s=carry;

            if(i>=0)
            {
                s += a[i];
                i--;
            }
            
            if(j>=0)
            {
                s += b[j];
                j--;
            }          
            
            res.add(s%10);
            carry = s/10;
        }
        
        Collections.reverse(res);
        return res;
        
    }
}