class Recursion{
      static int fact(int n){
            if(n == 0)
                  return 1;
            else
                  return n*fact(n-1);
      }
      
      public static void main(String argv[]){
            System.out.println(fact(14));
      }
};