//W A P to perform File Extration del text from del.txt and print in output.txt
import java.io.*;
class FileExtraction{
      public static void main(String argv[])throws Exception{
               PrintWriter pw = new PrintWriter("output.txt");
               BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
               String line = br1.readLine();
               while( line != null){
                     boolean av = false;
                     BufferedReader br2 = new BufferedReader(new FileReader("del.txt"));
                     String target = br2.readLine();
                     while(target != null){
                           if(line.equals(target)){
                           av = true;
                           break;
                           }
                         target = br2.readLine();
                     }
                     if(av == false){
                           pw.println(line);
                           
                     }
                     line = br1.readLine();
               }
               pw.flush();
      }
};