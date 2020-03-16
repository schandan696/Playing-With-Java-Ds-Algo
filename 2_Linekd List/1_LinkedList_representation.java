/*  class LinkedList
{
      Node head;  // head of list

      // Linked list Node.  This inner class is made static so that
      // main() can access it 
      static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next=null; } // Constructor
    }
 */




class LinkedList{
      Node head;
      static class Node{
            int data;
            Node next;
            Node(int value){
                  data = value;
            }      
      }
      void printlist(){
            Node n = head;
            while(n!=null){
                  System.out.println("Reference is "+n+" Data is "+n.data); // we dont need to worry about what is in refence jvm will take care of it.
                  n = n.next;
            }
      }
      public static void main(String argv[]){
            LinkedList list = new LinkedList();
            list.head = new Node(10);
            Node Second = new Node(20);
            Node Third = new Node(30);
            
            list.head.next = Second;
            Second.next = Third;
            list.printlist(); // printing the linkedlist
      }
};