class Solution {
    public int missingNumber(int[] nums) 
    {
        int n=nums.length;
        Arrays.sort(nums);
        int i;
        for( i=0;i<n;i++)
        {
            if(nums[i]!=i)
            {
                break;
            }
        }
        return i;
    }
}