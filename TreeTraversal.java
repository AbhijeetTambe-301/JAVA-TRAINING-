class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeTraversal {

    static void preOrder(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(TreeNode root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(TreeNode root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(15);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(9);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(4);

        System.out.print("Preorder: ");
        preOrder(root);

        System.out.print("\nInorder: ");
        inOrder(root);

        System.out.print("\nPostorder: ");
        postOrder(root);
    }
}