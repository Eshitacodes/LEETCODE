class Solution {
    public int minimumSubarrayLength(int[] nums, int k) 
    {
        int[] count=new int[32];
        int l=0,r=0,min=Integer.MAX_VALUE;

        while(r<nums.length)
        {
            update(count,nums[r],1);
            while(l<=r && getValue(count)>=k)
            {
                min=Math.min(min,r-l+1);
                update(count,nums[l],-1);
                l++;
            }
            r++;
        }

        return min==Integer.MAX_VALUE?-1:min;
    }

    public void update(int count[],int nums,int val)
    {
        for(int i=0;i<32;i++)
        {
            if(((nums>>i)&1)==1)
                count[i]+=val;
        }
    }

    public int getValue(int[] count)
    {
        int ans=0;

        for(int i=0;i<32;i++)
        {
            if(count[i]>0)
                ans=ans|(1<<i);
        }
        return ans;
    }
}