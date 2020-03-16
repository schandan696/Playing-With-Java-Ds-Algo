class Insert_in_SortedArray{
      static int insert(int arr[], int key, int n)
      {      
              int i=0;
              for(i=n-1; (arr[i]>key && i>=0); i--)
                  arr[i+1] = arr[i];
              arr[i+1] = key;
              return n+1;
      }
      
            public static void main(String args[]){
            int arr[] = new int[20];
            arr[0]=5; arr[1]=25; arr[2]=65; arr[3]=75; arr[4]=85; arr[5]=91; arr[6]=111; arr[7]=522;
            int key =69;
            int n = 8;
             for(int i=0; i<n; i++)
                  System.out.print(arr[i]+",");
            n=insert(arr,key,n);
            System.out.println("\nAfter Insertion");
            for(int i=0; i<n; i++)
                  System.out.print(arr[i]+",");
            }
};