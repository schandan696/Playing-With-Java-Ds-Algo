class Stack{
      static final int MAX = 1000;
      int top;
      int a[] = new int[MAX];
      boolean isEmpty()
      {
            return (top<0);
      }
      Stack()
      {
            top =-1;
      }
      boolean push(int k)
      {
            if(top >= MAX){
                  System.out.println("Stack is Full");
                  return false;
            }
            else
            {
                  a[++top] = k;
                  return true;
            }
      }
      int pop()
      {
            if(top < 0)
            {
                  System.out.println("Stack is Empty");
            }
            else{
                  int x = a[top--];
                  return x;
            }
            return -1;
      }
      public static void main(String argv[])
      {
            Stack s = new Stack();
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            s.push(60);
            System.out.println(s.pop());      
      }
};