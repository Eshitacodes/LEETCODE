class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
     int n=nums.length,i=0,j=0,prod=1;
     int ans=0;

     if(k==0)
     {
        return 0;
     }
     for(j=0;j<n;j++)
     {
        prod=prod*nums[j];

        while(i<j && prod>=k)
        {
            prod/=nums[i];
            i++;
        }
        if(prod<k)
        {
            ans+=j-i+1;
        }
     }
       
     return ans;
    }
}