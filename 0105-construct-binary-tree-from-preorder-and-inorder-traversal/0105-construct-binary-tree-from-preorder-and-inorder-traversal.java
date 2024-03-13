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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //base check  
        if (preorder.length == 0) {
            return null;
        }
        // Root node is the first element in preorder traversal
        int rootValue = preorder[0];
        // Find root's position in inorder to separate subtrees
        int rootIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootValue) {
                rootIndex = i;
                break;
            }
        }
        // Create the root node
        TreeNode root = new TreeNode(rootValue);
        // Build left subtree using elements before root in preorder and inorder copyOfRange(int[] original, int from, int to)

        root.left = buildTree(Arrays.copyOfRange(preorder, 1, rootIndex + 1), Arrays.copyOfRange(inorder, 0, rootIndex));
        // Build right subtree using elements after root in preorder and inorder
        root.right = buildTree(Arrays.copyOfRange(preorder, rootIndex + 1, preorder.length), Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length));
        // Return the constructed binary tree
        return root;
    }
}