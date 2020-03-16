class BubleSort{
      static void buble(int arr[]){
                int len = arr.length;
                for(int i=1; i<len; i++){
                     for(int j=0; j<len-i; j++){
                           if(arr[j]<arr[j+1]){
                             int temp = arr[j];
                             arr[j] = arr[j+1];
                             arr[j+1] = temp;
                           }      
                     }
                }
            }
      public static void main(String argv[]){
            int arr[] = {7,54,2,4,6,87,94,12,45,79,53,757,97,24};   
            buble(arr);
            for(int i=0; i<arr.length; i++){
               System.out.println(arr[i]);
            }
      }
};