
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
	public static void main (String[] args) throws java.lang.Exception
	{
		bTree tree = new bTree();
		
		tree.root = new Node(10);
		
		tree.root.left = new Node(20);
		
		tree.root.right = new Node(30);
		
		tree.root.left.left = new Node(40);
		
		tree.root.left.right = new Node(50);
	}
}
