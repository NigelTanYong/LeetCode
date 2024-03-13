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
    fun buildTree(inorder: IntArray, postorder: IntArray): TreeNode? {
        if (inorder.isEmpty())
            return null

        val rootValue = postorder.last()
        val root = TreeNode(rootValue)

        var rootIndex = 0
        // returns a range from 0 to array.size - 1,
        for (i in inorder.indices) {
            if (inorder[i] == rootValue) {
                rootIndex = i
                break
            }
        }

        val leftInorder = inorder.copyOfRange(0, rootIndex)
        val rightInorder = inorder.copyOfRange(rootIndex + 1, inorder.size)
        val leftPostorder = postorder.copyOfRange(0, leftInorder.size)
        val rightPostorder = postorder.copyOfRange(leftInorder.size, postorder.size - 1)

        root.left = buildTree(leftInorder, leftPostorder)
        root.right = buildTree(rightInorder, rightPostorder)

        return root
    }
}