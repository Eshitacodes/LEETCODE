class Solution {

    public void targetSum(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds)
    {
        if(ind==arr.length)
        {
            if(target==0)
                ans.add(new ArrayList<>(ds));//not a constant operation

            return;
        }

        if(arr[ind]<=target)
        {
            ds.add(arr[ind]);
            targetSum(ind,arr,target-arr[ind],ans,ds);//pick part
            ds.remove(ds.size()-1);
        }
        
        targetSum(ind+1,arr,target,ans,ds);//not pick that index and move to the next index
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
     List<List<Integer>> ans= new ArrayList<>();
     targetSum(0,candidates,target,ans, new ArrayList<>());
     return ans;
     
    }
}   