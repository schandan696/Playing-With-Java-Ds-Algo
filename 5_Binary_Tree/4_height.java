import java.util.Queue;
import java.util.LinkedList;

/* Class to represent Tree node */
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}

/* Class to print Level Order Traversal */
class BinaryTree {

    Node root;

    /* Given a binary tree. Print its nodes in level order
     using array for implementing queue  */
    int height(Node root)
    {
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }

    public static void main(String args[]) 
    {
        
        
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
        
        System.out.println(tree_level.height(tree_level.root));
        
    }
}