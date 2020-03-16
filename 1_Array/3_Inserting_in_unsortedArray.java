class Inserting{
      static boolean insert(int[] arr, int key, int n){
               if(arr.length>=n){
                  arr[n] = key;
                  return true;
                  }
           return false;
      }
      
      public static void main(String argv[]){
             int arr[] = new int[20];
             arr[0] = 12;
             arr[0] = 18;
             arr[0] = 19;
             arr[0] = 126;
             arr[0] = 10;
             arr[0] = 178;
             int n = 6;
             int key =26;
             
             System.out.println("Insert Status " +insert(arr,key,n));
      }
};