import java.util.Arrays;
class Solution {
    public int firstMissingPositive(int[] nums) {
        int nat=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==nat)
            {
                nat++;
            }
        }
        System.gc();
        return nat;
        
    }
}