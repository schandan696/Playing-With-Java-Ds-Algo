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
      void append(int newData){
            
            Node new_Node= new Node(newData);
            if(head == null){
                  head = new Node(newData);
                  return;      
            }
            new_Node.next = null;
            Node last = head;
            while(last.next!=null)
                  last = last.next;
            last.next= new_Node;
      }
      
            public static void main(String argv[]){
            LLInsertion list = new LLInsertion();
            list.head = new Node(10);
            Node second = new Node(20);
            Node third = new Node(30);
            
            list.head.next = second;
            second.next = third;
            list.append(40);
            list.printlist();
      }
}