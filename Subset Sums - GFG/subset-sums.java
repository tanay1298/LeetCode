// ref video - https://www.youtube.com/watch?v=rYkfBRtMJr8

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    
    public static void rec(ArrayList<Integer> arr, int i, int N, int cs, ArrayList<Integer> al)
    {
        if(i==N)
        {
            al.add(cs);
            return;
        }
        
        rec(arr, i+1, N, cs+arr.get(i), al);
        rec(arr, i+1, N, cs, al);
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N)
    {
        ArrayList<Integer> al = new ArrayList<>();
        
        int i=0;
        int cs = 0;
        rec(arr, i, N, cs, al);
        
        return al;
    }
}
