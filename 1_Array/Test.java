import java.util.*;  
 class Test{
 public static void main(String ar[]){
 
            int[] arr = {8,95,7,9,33,54,9,64,64,23,24,54};
            List<Integer> ls = new ArrayList<>();
            for(int a : arr){
                  ls.add(a);
            }
            ls.forEach(v->{System.out.println(v);});
      }
};