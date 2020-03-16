class Searching{
         static int search(int arr[],int key){
               for(int i=0; i<arr.length; i++){
                     if(arr[i]==key)
                     return i;
               }
            return -1;   
         }
      public static void main(String argv[]){
            int arr[] = {43,57,988,32,4,79,74,423,11,4687,53,113,64,2,57,354};
            int key = 113;
            int postion = search(arr,key);
            if(postion < 0){
                  System.out.println("Key not found in the array");
            }
            else{
                   System.out.println("Key found at postion :" + (postion+1));
            }
      }
};