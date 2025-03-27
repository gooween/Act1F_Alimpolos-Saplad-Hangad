
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    
    public void insert(int data) {
        root = insertRec(root, data);
    }

    
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    
    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    
    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();

        
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(8);
        tree.insert(20);
        

        System.out.println("In-order traversal:");
        tree.inOrder(); 
        System.out.println();

        System.out.println("Pre-order traversal:");
        tree.preOrder(); 
        System.out.println();

        System.out.println("Post-order traversal:");
        tree.postOrder(); 
        System.out.println();
    }
}
  
