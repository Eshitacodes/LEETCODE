class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {

        int left=0,right=arr.length-1;

        while(left<arr.length-1 && arr[left]<=arr[left+1])
        {
            left++;
        }

        if(left==arr.length-1)
            return 0;

        while(right>left && arr[right]>=arr[right-1])
        {
            right--;
        }

        int ans=Math.min(arr.length-left-1,right);

        int i=0,j=right;
        while(i<=left && j<arr.length)
        {
            if(arr[j]>=arr[i])
            {
                ans=Math.min(ans,j-i-1);
                ++i;
            }
            else
                ++j;
        }

        return ans;
    }
}