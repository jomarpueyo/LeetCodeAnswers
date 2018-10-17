//Problem 538. Convert BST to Greater Tree https://leetcode.com/problems/convert-bst-to-greater-tree/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinarySearchTree {
    
    int sum = 0;
    
    public TreeNode convertBST(TreeNode root) {
        
        if (root == null){
            return null;            //Returns back to previous node
        }
        
        convertBST(root.right);     //Recursion
        root.val += sum;            //Current root's value += right node's value
        sum = root.val;             //Global Sum = current value;
        convertBST(root.left);      //Recursion again
        return root;
    }
}
