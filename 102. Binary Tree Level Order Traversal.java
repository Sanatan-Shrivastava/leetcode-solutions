// Link : https://leetcode.com/problems/binary-tree-level-order-traversal/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // return a List<List<Integer>> root to return;
        List<List<Integer>> order = new ArrayList<>();

        // if root is null, return the empty list
        if (root == null) {
            return order;
        }

        // declare the wqueue for the level order traversal
        Queue<TreeNode> queue = new LinkedList<>();

        // start the BFS
        queue.add(root);

        // until the queue is empty;
        while (!queue.isEmpty()) {
            // fetch the size of the queue;
            int size = queue.size();

            // list to store all the nodes of a particular level
            List<Integer> currLevel = new ArrayList<>();

            // iterate through the nodes on a particular level
            for (int i = 0; i < size; i++) {

                TreeNode current = queue.poll();

                currLevel.add(current.val);

                // iterate through the left and right children of those nodes
                // if any of them isn't null, put them in queue

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }

            }

            // add the current level into the final list to be returned;

            order.add(currLevel);
        }

        // return the list;
        return order;
    }
}