class Search_in_SortedArray{
      static int search(int arr[],int low,int high, int key)
      {      
                if (high < low)
                return -1;
                int mid = (low + high)/2;  /*low + (high - low)/2;*/
                if (key == arr[mid])
                return mid;
                if (key > arr[mid])
                return search(arr, (mid + 1), high, key);
                return search(arr, low, (mid -1), key);
      }
      
            public static void main(String args[]){
            int arr[] = {5,25,65,75,85,91,111,522};
            int key =65;
            System.out.println("Indes of "+key+" is : "+ search(arr,0,arr.length,key));
            }
};