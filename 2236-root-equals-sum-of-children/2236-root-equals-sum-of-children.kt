/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun checkTree(root: TreeNode?): Boolean {
        
//         basecase
        if (root == null)
            return true
        
        if(root.left!= null && root.right != null)
        {
            return (root.`val` == root.left.`val` + root.right.`val`)
        }
        return false
        
    }
}