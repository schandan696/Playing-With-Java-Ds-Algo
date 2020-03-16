class InsertionSort{
      static void sort(int arr[]){
                     int len = arr.length;
                       for(int i=1;i<len; i++){
                           int value = arr[i];
                           int j = i;
                           while(j>0 && arr[j-1] > value){
                              arr[j] = arr[j-1];
                              j = j-1;
                           }
                           arr[j] = value;
                       }
                            }
      public static void main(String argv[]){
            int arr[] = {7,54,2,4,6,87,94,12,45,79,53,757,97,24};  
            sort(arr); 
            for(int i=0; i<arr.length; i++){
               System.out.println(arr[i]);
            }
      }
};