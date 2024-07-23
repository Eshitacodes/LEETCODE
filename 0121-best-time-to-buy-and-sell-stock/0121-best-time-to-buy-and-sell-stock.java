import java.util.*;
class Solution {
    public int maxProfit(int[] prices) 
    {
     int max_prof=0,prof=0;
     int l=0,r=1;
     while(r<prices.length)
     {
        if(prices[l]<prices[r])
        {
            prof=prices[r]-prices[l];
            max_prof=Math.max(prof,max_prof);
        }
        else
        {
            l=r;
        }
         r++;

     }
     return max_prof;
 
}
}