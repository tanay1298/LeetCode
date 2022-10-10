//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

struct Item{
    int value;
    int weight;
};


// } Driver Code Ends
//class implemented
/*
struct Item{
    int value;
    int weight;
};
*/


class Solution
{
    public:
    
    static bool cmp(pair<double,Item>a, pair<double,Item> b)
    {
        return a.first > b.first;
    }
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        vector<pair<double,Item>> v;
        
        for(int i=0;i<n;i++)
        {
            Item it = arr[i];
            double x = (1.0*it.value)/it.weight;
            v.push_back(make_pair(x, it));
        }
        
        sort(v.begin(), v.end(), cmp);
        
        double p = 0.0;
        int w = 0;
        
        for(auto x : v)
        {
            int cw = x.second.weight;

            if(w+cw <= W)
            {
                w += cw;
                p += x.second.value;
            }
            else
            {
                int wt_left = W-w;
                // double frac = (1.0*wt_left)/cw;
                // p += frac * x.second.value;
                
                p += x.first * wt_left;
                
                break;
            }
        }
        return p;
    }
        
};


//{ Driver Code Starts.
int main()
{
	int t;
	//taking testcases
	cin>>t;
	cout<<setprecision(2)<<fixed;
	while(t--){
	    //size of array and weight
		int n, W;
		cin>>n>>W;
		
		Item arr[n];
		//value and weight of each item
		for(int i=0;i<n;i++){
			cin>>arr[i].value>>arr[i].weight;
		}
		
		//function call
		Solution ob;
		cout<<ob.fractionalKnapsack(W, arr, n)<<endl;
	}
    return 0;
}
// } Driver Code Ends