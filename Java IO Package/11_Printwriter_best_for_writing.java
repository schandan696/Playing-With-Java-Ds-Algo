import java.io.*;
class Printwriter_best_for_writing{
         public static void main(String argv[])throws Exception{
                  PrintWriter pw = new PrintWriter("abc.txt");
                  pw.write(100);
                  pw.println(100);
                  pw.println(true);
                  pw.println('c');
                  pw.println("DURGASOT");
                  pw.flush();
                  pw.close();
         }
};