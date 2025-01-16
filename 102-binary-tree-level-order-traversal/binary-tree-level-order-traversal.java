/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);   

        
        while(!queue.isEmpty())
        {
            List<Integer> subList=new ArrayList<>();
            int size=queue.size();

            for(int i=0;i<size;i++)
            {
                TreeNode parent=queue.poll();

                if(parent.left!=null)
                    queue.add(parent.left);
                if(parent.right!=null)
                    queue.add(parent.right);
                subList.add(parent.val);
            }

            ans.add(subList);
        }
        return ans;
    }
}