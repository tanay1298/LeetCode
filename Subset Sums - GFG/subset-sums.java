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
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N)
    {
       int lim = (int)Math.pow(2,N);
       ArrayList<Integer> al = new ArrayList<>();
       
       for(int i=0; i<lim; i++)
       {
           int x = i;
           int cs = 0;
           
           // convert x to binary
           for(int j=N-1;j>=0;j--)
           {
               int rem = x%2;
               x=x/2;
               
               if(rem==1)
                cs += arr.get(j);
           }
           
           al.add(cs);
       }
       
       return al;
    }
}