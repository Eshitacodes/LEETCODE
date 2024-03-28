class Solution {
    public int maxSubarrayLength(int[] nums, int k) 
    {
     int i=0,max=0;
     HashMap<Integer,Integer> h=new HashMap<>();
     int value;
     for(int j=0;j<nums.length;j++)
     {
        if(h.containsKey(nums[j]))
        {
            h.put(nums[j],h.get(nums[j])+1);
        }
        else
        {
            h.put(nums[j],1);
        }
        value=h.get(nums[j]);
        while(value>k && i<j)
        {
            h.put(nums[i],h.get(nums[i])-1);
            value=h.get(nums[j]);
            i++;
        }
        if(j-i+1>max)
        {
            max=j-i+1;
        }
     } 
     return max;  
    }
}