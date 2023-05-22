/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool checkTree(struct TreeNode* root){
 if (root == -1) {
            return true; // An empty tree is considered valid
        }

        int sum = 0;
        if (root->left != -1) {
            sum += root->left->val; // Add the value of the left child
        }
        if (root->right != -1) {
            sum += root->right->val; // Add the value of the right child
        }

        return root->val == sum; // Return true if root value equals the sum
    
}