package com.binaryTree;

/**
 * 450. 删除二叉搜索树中的节点
 * 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。
 * 返回二叉搜索树（有可能被更新）的根节点的引用。
 *
 * 一般来说，删除节点可分为两个步骤：
 * 首先找到需要删除的节点；
 * 如果找到了，删除它。
 * 说明： 要求算法时间复杂度为 O(h)，h 为树的高度。
 *
 * 示例:
 * root = [5,3,6,2,4,null,7]
 * key = 3
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 * 给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。
 * 一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。
 *     5
 *    / \
 *   4   6
 *  /     \
 * 2       7
 *
 * 另一个正确答案是 [5,2,6,null,4,null,7]。
 *     5
 *    / \
 *   2   6
 *    \   \
 *     4   7
 */
public class DeleteNodeTToBST {
    public TreeNode deleteNode(TreeNode<Integer> root, int key) {
        //空值情况
        if (root == null)
            return null;
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        }
        //到这里意味着已经查找到目标元素
        //右子树为空，返回当前节点的左子树
        if(root.right == null)
            return root.left;
        //左子树为空，返回当前节点的右子树
        if(root.left == null)
            return root.right;
        TreeNode<Integer> mintree = root.right;
        while (mintree.left != null)
            mintree = mintree.left;
        root.val = mintree.val;
        root.right = deleteNode(root.right);
        return root;
    }

    private TreeNode deleteNode(TreeNode right) {
        return null;
    }
}
