// remove Duplicate Elements  from files;
import java.io.*;
class DuplicateEleminate{
      public static void main(String argv[]) throws Exception{
            BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
            PrintWriter pw = new PrintWriter("output.txt");
            String line = br1.readLine();
            while(line != null)
            {
            boolean av = false;
            BufferedReader br2 = new BufferedReader(new FileReader("output.txt"));
            String target = br2.readLine();
            while(target!=null){
                  if(line.equals(target)){
                        av = true;
                        break;
                  }
             target = br2.readLine();     
            }
            if(av == false){
                  pw.println(line);
                  pw.flush();
            }
            line = br1.readLine();
      }
      }
};