class Recursion{
      
      static int isArr(int []A, int ind){
            if(ind == 1)
                  return 1;
            return (A[ind-1] < A[ind-2]?0:isArr(A, ind-1));
      }
      
      public static void main(String argv[]){
            int arr[] = {1,2,3,4,5,6};
            System.out.println(isArr(arr, 6));
      }
};