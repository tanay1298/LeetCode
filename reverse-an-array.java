// reverse an array after position m

// a = [1,2,3,4,5,6]
// m = 3
// res = [1,2,3,4,6,5]

public static void reverseArray(ArrayList<Integer> arr, int m)
{
     int n = arr.size();
     int start = m+1;
     int last = n-1;

     while(start<last){
         Collections.swap(arr, start, last);
         start++;
         last--;
     }

}