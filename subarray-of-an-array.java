// 1. You are given an array of size 'n' and n elements of the same array.
// 2. You are required to find and print all the subarrays of the given array. 
// 3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.

// Sample Input
// 3
// 10
// 20
// 30
// Sample Output
// 10	
// 10	20	
// 10	20	30	
// 20	
// 20	30	
// 30	



for(int i=0;i<n;i++)
{
    for(int j=i;j<n;j++)
    {
        for(int k=i;k<=j;k++)
        {
            Sydtem.out.print(a[k] + " ");
        }
        System.out.println();
    }
}