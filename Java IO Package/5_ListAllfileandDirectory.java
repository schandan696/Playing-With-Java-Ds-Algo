import java.io.*;
class ListAllfileandDirectory{
         public static void main(String argv[])throws Exception {
               File f = new File("D:\\A");
               String s[] = f.list();
               System.out.println("Avialble Files in D:\\A Are :");
               System.out.println(" ");
               for(String s1 : s){
                     File f1 = new File(f,s1);
                     if(f1.isFile()){
                     System.out.println(s1);
                     }
               }
               System.out.println("Avialble Directory in D:\\A Are :");
               System.out.println(" ");
               for(String s1 : s){
                     File f1 = new File(f,s1);
                     if(f1.isDirectory()){
                     System.out.println(s1);
                     }
               }

         }
         
};