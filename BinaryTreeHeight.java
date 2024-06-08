class Node{
    int data;
    Node left, right;

    public Node(int item){
        data = item;
        left = right = null;
    }
}

public class BinaryTreeHeight {

    Node root;

    public int getHeight(Node node){
        if(node == null)
            return 0;
        else{
            int leftHeight = getHeight(node.left);
            int rightHeight = getHeight(node.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String[] args) {

        BinaryTreeHeight tree = new BinaryTreeHeight();

        tree.root = new Node(6);
        tree.root.left = new Node(4);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(9);

        int height = tree.getHeight(tree.root);
        System.out.println("Height of Binary tree is : " + height);
    }
}