class Selsort{
      static void sort(int arr[]){
      int n = arr.length;
       for(int i=0; i<n-1;i++){ 
            int Min = i;
               for(int j=i+1; j<n; j++)
               {
                  if(arr[j]<arr[Min])
                     Min = j;
               }
               int temp = arr[i];
               arr[i]=arr[Min];
               arr[Min]=temp;
               } 
      }
     public static void main(String argv[]){
         int arr[]={7,3,4,11,2,1,8,21,6 };
         Selsort.sort(arr);
         for(int i=0; i<arr.length;i++)
         {
            System.out.println(arr[i]);
         }  
     }
};
