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
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (preorder.isEmpty()) return null
        
        val rootValue = preorder[0]
        val rootIndex = inorder.indexOf(rootValue)
        
        val root = TreeNode(rootValue)
        root.left = buildTree(preorder.sliceArray(1 until rootIndex+1), inorder.sliceArray(0 until rootIndex))
        root.right = buildTree(preorder.sliceArray(rootIndex + 1 until preorder.size), inorder.sliceArray(rootIndex + 1 until inorder.size))
        
        return root
        
    }
}