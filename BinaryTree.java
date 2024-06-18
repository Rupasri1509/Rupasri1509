class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTree {
    static TreeNode constructBinaryTree(int[] arr, int index) {
        if (index >= arr.length || arr[index] == -1) {
            return null;
        }

        TreeNode root = new TreeNode(arr[index]);
        root.left = constructBinaryTree(arr, 2 * index + 1);
        root.right = constructBinaryTree(arr, 2 * index + 2);

        return root;
    }

    static void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,2,6,1,9,-1,8,-1,-1,-1,-1,4,-1}; // Example array representing binary tree
        TreeNode root = constructBinaryTree(arr, 0);
        System.out.println("Inorder Traversal of Constructed Tree:");
        preorderTraversal(root);
    }
}
