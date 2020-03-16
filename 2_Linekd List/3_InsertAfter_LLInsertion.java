class LLInsertion{
      Node head;
      static class Node{
            int data;
            Node next;
            Node(int d){
                  data = d;
                  next = null; 
            }
      }
      // method to print the value of the Linkedlist
      void printlist(){
            Node n = head;
            while(n!=null)
            {
                  System.out.println("Value = "+n.data);
                  n = n.next;
            }
      }
      void InsertAfter(Node prev , int data)
      {     if(prev == null)
                  return;
            
            Node newNode = new Node(data);
            newNode.next = prev.next;
            prev.next = newNode;
      }
      public static void main(String argv[]){
            LLInsertion list = new LLInsertion();
            list.head = new Node(10);
            Node second = new Node(20);
            Node third = new Node(30);
            Node fourth = new Node(40);
            list.head.next = second;
            second.next = third;
            list.InsertAfter(fourth,25);
            list.printlist();
      }
}