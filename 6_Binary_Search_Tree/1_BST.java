class BST{
      class Node{
            int data;
            Node left, right;
            Node(int k){
                  data = k;
                  left=right=null;
            }
      };
      
      Node root;
      Node insert(Node root , int key){
            if(root == null){
                  root = new Node(key);
            }
            
            if(key < root.data)
                  root.left = insert(root.left, key);
            
            else if(key > root.data)
                  root.right = insert(root.right,key);
                  
            return root;
      }
     
       void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
      }
      void insert(int d){
           root = this.insert(root,d);
      }
    
      public static void main(String argv[]){
            BST b = new BST();
            b.insert(10);
            b.insert(8);
            b.insert(12);
            b.insert(17);
            b.insert(5);
            b.insert(4);
            b.insert(11);
            b.insert(22);
            b.insert(6);
            b.insert(3);
            b.insert(1);
            b.inorderRec(b.root);
      }
      
}