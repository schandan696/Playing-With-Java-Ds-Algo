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
      void push(int data)
      {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
      }
      public static void main(String argv[]){
            LLInsertion list = new LLInsertion();
            list.head = new Node(10);
            Node second = new Node(20);
            Node third = new Node(30);
            list.head.next = second;
            second.next = third;
            list.push(7);
            list.push(5);
             list.push(3);
            list.printlist();
      }
}