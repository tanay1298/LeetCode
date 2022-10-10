//{ Driver Code Starts
// Program to find the maximum profit job sequence from a given array 
// of jobs with deadlines and profits 
#include<bits/stdc++.h>
using namespace std; 

// A structure to represent a job 
struct Job 
{ 
    int id;	 // Job Id 
    int dead; // Deadline of job 
    int profit; // Profit if job is over before or on deadline 
}; 


// } Driver Code Ends
/*
struct Job 
{ 
    int id;	 // Job Id 
    int dead; // Deadline of job 
    int profit; // Profit if job is over before or on deadline 
};
*/

class Solution 
{
    public:
    
    //Function to find the maximum profit and the number of jobs done.
    vector<int> JobScheduling(Job arr[], int n) 
    { 
        vector<pair<int,int>> vp;
        
        for(int i=0;i<n;i++)
        {
            Job j = arr[i];
            vp.push_back(make_pair(j.dead, j.profit));
        }
        
        sort(vp.begin(), vp.end());
        
        int total_profit = 0;
        vector<int> v;
        
        int d = 0;
        int j = n-1;
        
        priority_queue<int> pq; // max pq by default
        
        for(int curr_dead=n;curr_dead>0;curr_dead--)
        {
            while(j>=0 && vp[j].first >= curr_dead)
            {
                // add profit in pq
                pq.push(vp[j].second);
                j--;
            }
            
            if(pq.size()>0)
            {
                d++;
                total_profit += pq.top();
                pq.pop();
            }
        }
        
        
        v.push_back(d);
        v.push_back(total_profit);
        
        return v;
    } 
};

//{ Driver Code Starts.
// Driver program to test methods 
int main() 
{ 
    int t;
    //testcases
    cin >> t;
    
    while(t--){
        int n;
        
        //size of array
        cin >> n;
        Job arr[n];
        
        //adding id, deadline, profit
        for(int i = 0;i<n;i++){
                int x, y, z;
                cin >> x >> y >> z;
                arr[i].id = x;
                arr[i].dead = y;
                arr[i].profit = z;
        }
        Solution ob;
        //function call
        vector<int> ans = ob.JobScheduling(arr, n);
        cout<<ans[0]<<" "<<ans[1]<<endl;
    }
	return 0; 
}



// } Driver Code Ends