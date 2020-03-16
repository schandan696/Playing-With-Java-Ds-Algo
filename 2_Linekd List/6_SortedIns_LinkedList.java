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
      void sortedIns(Node newNode)
      {
            Node current;
            if(head == null || head.data >= newNode.data){
            newNode.next = head;
            head = newNode;}
            else
            {
                  current = head;
                  while(current.next != null && current.next.data < newNode.data)
                        current = current.next;
               newNode.next = current.next;
               current.next = newNode;
             }
               

            
      }
      Node newNode(int data)
      {
             Node x = new Node(data);
             return x;
      }
      
            public static void main(String argv[]){
            LLInsertion list = new LLInsertion();
            list.head = new Node(10);
            Node second = new Node(20);
            Node third = new Node(30);
            Node four = new Node(40);
            list.head.next = second;
            second.next = third;
            third.next = four;
            Node newnode = list.newNode(25);
            list.sortedIns(newnode);
            list.printlist();
      }
}