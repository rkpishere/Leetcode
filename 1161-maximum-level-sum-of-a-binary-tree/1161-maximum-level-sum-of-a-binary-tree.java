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
ArrayList<Integer> list=new ArrayList<>();
    public void levelorder(TreeNode root){
        if(root==null){
            return ;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0; i<size;i++){
                TreeNode curr=q.poll();
                sum+=curr.val;
                 if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            list.add(sum);
        }
        

    }
    public int maxLevelSum(TreeNode root) {
        levelorder(root);
        int max=root.val;
        int idx=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
                idx=i;
            }
        }
        return idx+1;
    }
}