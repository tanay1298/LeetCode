// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to print all subsets of arr. Each subset should be
// on separate line. For more clarity check out sample input and output.

// Sample Input
// 3
// 10
// 20
// 30
// Sample Output
// -	-	-	
// -	-	30	
// -	20	-	
// -	20	30	
// 10	-	-	
// 10	-	30	
// 10	20	-	
// 10	20	30	


int limit = (int)Math.pow(2,n);

for(int i=0;i<limit;i++)
{
    String res = "";
    int x = i;

    for(int j=n-1;j>=0;j--)
    {
        int rem = x%2;
        x=x/2;

        if(x==0)
        {
            res = "_ " + res;
        }
        else if(x==1)
        {
            res = a[j] + " " + res;
        }
    }
    System.out.println(set);
}
