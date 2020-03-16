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
    void printLevelOrder(){
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         while(!q.isEmpty()){
               Node temp = q.poll();
               System.out.print(temp.data+" ");
         
               if(temp.left != null)
                     q.add(temp.left);
               
               if(temp.right != null)
                     q.add(temp.right);
         
         }  
   }

    public static void main(String args[]) 
    {
        /* creating a binary tree and entering 
         the nodes */
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
        tree_level.root.right.left = new Node(6);
        tree_level.root.right.right = new Node(7);
        
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
}