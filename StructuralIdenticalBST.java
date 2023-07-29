class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class StructuralIdenticalBST {

    public static boolean areStructurallyIdentical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        return areStructurallyIdentical(root1.left, root2.left) && areStructurallyIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(2);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(8);

        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(11);
        root2.left.left = new TreeNode(7);
        root2.left.right = new TreeNode(12);
        root2.right.left = new TreeNode(8);
        root2.right.right = new TreeNode(6);

        System.out.println("Example 1 - Are the trees structurally identical? " + areStructurallyIdentical(root1, root2));
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);

        TreeNode root4 = new TreeNode(4);
        root4.left = new TreeNode(5);
        root4.right = new TreeNode(6);

        System.out.println("Example 2 - Are the trees structurally identical? " + areStructurallyIdentical(root3, root4));
    }
}

