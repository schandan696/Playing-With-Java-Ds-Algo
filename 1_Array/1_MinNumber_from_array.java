//Program to get minimum number in an array using a method.

class MinNumber{
      static void Min(int num[]){
            int min = num[0];
            for(int i=0; i<num.length; i++){
                  if(min > num[i]){
                  min = num[i];
                 }
            }
            System.out.println(min);
      }
      public static void main(String ar[]){
            int arr[] = {8,95,7,9,33,54,9,64,64,23,24,54};
            Min(arr);
      }
};