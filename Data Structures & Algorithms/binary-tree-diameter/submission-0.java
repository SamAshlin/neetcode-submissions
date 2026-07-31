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

    int maxdia=0;

    public int diameterOfBinaryTree(TreeNode root) {

        diaheight(root);

        return maxdia;
    }

    int diaheight(TreeNode node){

        if(node==null){
            return 0;
        }

        int leftheight=diaheight(node.left);
        int rightheight=diaheight(node.right);

        int currdia=leftheight+rightheight;
        maxdia=Math.max(maxdia,currdia);

        return 1+Math.max(leftheight,rightheight);

    }
}
