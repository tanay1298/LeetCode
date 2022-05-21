class Solution {
    
    public int maxProfit(int[] prices) 
    {
       
        int dpi0 = 0;
        int dpi0_prev = 0;
        int dpi1 = -(int)(1e9);

        for(int i=0; i<prices.length; i++)
        {
            int dpi_10=dpi0;

            dpi0 = Math.max(dpi0, dpi1+prices[i]);
            dpi1 = Math.max(dpi1, dpi0_prev-prices[i]);

            dpi0_prev = dpi_10;
        }

        return dpi0;
    }
} 