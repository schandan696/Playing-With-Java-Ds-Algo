class Deletion_in_SortedArray{
      static int delete(int arr[], int key,int n)
      {      int pos = search(arr,key);
             for(int i=pos; i<n-1; i++){
                  arr[i]=arr[i+1];
             }
           return n-1;  
      }
      static int search(int[] arr, int key){
              for(int i=0; i<arr.length; i++){
                  if(arr[i]==key)
                  return i;
              }
              return -1;
      }
      
            public static void main(String args[]){
            int arr[] = {5,25,65,75,85,91,111,522};
            int n = arr.length;
            int key =75;
             for(int i=0; i<n; i++)
                  System.out.print(arr[i]+",");
            n=delete(arr,key,n);
            System.out.println("\nAfter Deletion");
            for(int i=0; i<n; i++)
                  System.out.print(arr[i]+",");
            }
};