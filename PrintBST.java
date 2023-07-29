
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
    Node root;

    public BST() {
        this.root = null;
    }

    // Function to print the BST nodes in in-order traversal
    public void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }

    // Helper function to call printInOrder from the root
    public void printInOrder() {
        printInOrder(root);
        System.out.println(); // Print a new line after the traversal
    }

    // Other methods to add nodes and perform BST operations
    // ...
}

public class PrintBST {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = new Node(50);
        bst.root.left = new Node(30);
        bst.root.right = new Node(70);
        bst.root.left.left = new Node(20);
        bst.root.left.right = new Node(40);
        bst.root.right.left = new Node(60);
        bst.root.right.right = new Node(80);

        // Print the BST in in-order traversal
        System.out.println("BST nodes in in-order:");
        bst.printInOrder();
    }
}

