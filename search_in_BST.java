class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        } else if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }
}

public class search_in_BST {
    // Helper method to build a BST from an array
    public static TreeNode buildBST(Integer[] nodes, int index) {
        if (index < nodes.length && nodes[index] != null) {
            TreeNode root = new TreeNode(nodes[index]);
            root.left = buildBST(nodes, 2 * index + 1);
            root.right = buildBST(nodes, 2 * index + 2);
            return root;
        }
        return null;
    }

    // Helper method to perform inorder traversal and print the BST
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Integer[] nodes = {4, 2, 7, 1, 3}; // Example BST nodes
        TreeNode root = buildBST(nodes, 0);
        int targetVal = 6;

        Solution solution = new Solution();
        TreeNode result = solution.searchBST(root, targetVal);

        System.out.print("Inorder traversal of the original BST: ");
        inorderTraversal(root);
        System.out.println();

        if (result != null) {
            System.out.println("Found node with value " + targetVal + " in the BST.");
        } else {
            System.out.println("Node with value " + targetVal + " not found in the BST.");
        }
    }
}
