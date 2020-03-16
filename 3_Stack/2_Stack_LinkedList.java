class Stack{
   
      Node head;
      class Node{
            int data;
            Node next;
            public Node(int d){
                  data = d;
            }
      }
      void push(int d){
            Node newNode = new Node(d);
            newNode.next = head;
            head = newNode;
      }
      void print(){
            Node temp = head;
            while( temp!=null){
                  System.out.print(temp.data+" ");
                  temp = temp.next;
            }
      }
      void pop(){
            if(head != null)
            head = head.next;
      }
      int peek(){
            System.out.print(head.data);
            return head.data;
      }
      public static void main(String argv[]){
            Stack s = new Stack();
            s.push(10);
            s.push(20);
            s.push(30);
            s.peek();
            s.pop();
            s.push(40);
            s.print();
      }
};