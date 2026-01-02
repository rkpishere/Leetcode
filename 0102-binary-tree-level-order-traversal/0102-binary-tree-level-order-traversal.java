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
     List<List<Integer>> list=new ArrayList<>();
     public  void levelorder(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
      
        while (!q.isEmpty()) {
            int size=q.size();
           List<Integer> level=new ArrayList<>();
           for(int i=0;i<size;i++){
            TreeNode currNode = q.poll();
            level.add(currNode.val);
            if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }

           }
                //System.out.print(currNode.data + " ");
                
            list.add(level);
            }
        }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
       levelorder(root);
       return list;
    }
}