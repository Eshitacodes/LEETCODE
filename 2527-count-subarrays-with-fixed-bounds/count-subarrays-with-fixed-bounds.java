class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) 
    {
     long ans=0,problemIndex=-1,minIndex=-1,maxIndex=-1;

     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]>maxK || nums[i]<minK)
        {
            problemIndex=i;
        }
        if(nums[i]==minK)
        {
            minIndex=i;
        }
        if(nums[i]==maxK)
        {
            maxIndex=i;
        }

        ans+=Math.max(0, Math.min(minIndex,maxIndex)-problemIndex);

     }  
     return ans; 
    }
}