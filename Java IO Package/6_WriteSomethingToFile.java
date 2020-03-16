import java.io.*;
class WriteSomethingToFile{
         public static void main(String argv[])throws Exception {
         
         FileWriter fw = new FileWriter("abc.txt");   //FileOverride
         //FileWriter fw = new FileWriter("abc.txt",true);   //FileAppend
         
         fw.write(100);
         fw.write("urga\nSoftwareSolutions");
         fw.write('\n');
         char ch[] = {'A','B','C'};
         fw.write(ch);
         fw.write('\n');
         fw.flush();
         fw.close();
         }
};