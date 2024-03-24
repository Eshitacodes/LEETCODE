class Solution {
    public int findDuplicate(int[] nums) 
    {
     HashMap<Integer,Integer> map=new HashMap<>();
     int n=nums.length;
     int i;
     for(i=0;i<n;i++)
     {
        if(map.containsKey(nums[i]))
        {
            break;
        }
        else
        {
            map.put(nums[i],i);
        }
        
     } 
     return nums[i];

    }
}