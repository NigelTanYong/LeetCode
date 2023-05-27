# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def checkTree(self, root):
        if root is None:
            return True
        sum = 0
        if root.left is not None:
            sum+=root.left.val
        if root.right is not None:
            sum+=root.right.val
            
        return sum==root.val
            
        
        