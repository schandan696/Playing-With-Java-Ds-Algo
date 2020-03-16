
import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
        int key;
        Node left , right;
        public Node(int data){
            key = data;
            left = right = null;
        }
}



class bTree
{   
    Node root;
    
    public bTree (int data){
        
        root = new Node(data);
        
    }
    public bTree (){
        
        root = null;
        
    }
    
    void PrintPostorder(Node node){
            if(node == null)
                    return;
            PrintPostorder(node.left);
            
            
            PrintPostorder(node.right);
            
            
            System.out.print(node.key+" ");
        
    }
    void PrintInorder(Node node){
            if(node == null)
                  return;
            PrintInorder(node.left);
            
            System.out.print(node.key+" ");
            
            PrintInorder(node.right);
    }
    
    void PrintPreorder(Node node){
            if(node == null)
                  return;
                  
            System.out.print(node.key+" ");
            
            PrintPreorder(node.left);
            
            PrintPreorder(node.right);
    }
    void PrintPreorder(){System.out.print("Preorder : ");PrintPreorder(this.root);}
    
    void PrintInorder(){System.out.print("Inorder : ");PrintInorder(this.root);}
    
    void PrintPostorder(){System.out.print("Postorder : ");PrintPostorder(this.root);}
    
	public static void main (String[] args) throws java.lang.Exception
	{
		bTree tree = new bTree();
		
		tree.root = new Node(10);
		
		tree.root.left = new Node(20);
		
		tree.root.right = new Node(30);
		
		tree.root.left.left = new Node(40);
		
		tree.root.left.right = new Node(50);
		
		tree.PrintPostorder();
      tree.PrintInorder();
      tree.PrintPreorder();
	}
}
