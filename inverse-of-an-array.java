public static int[] inverse(int[] a)
{
    int n = a.length;
    int inv[] = new int[n];

    for(int i=0;i<n;i++)
    {
        int x = a[i];
        inv[x] = i;
    }
    
    return inv;
}