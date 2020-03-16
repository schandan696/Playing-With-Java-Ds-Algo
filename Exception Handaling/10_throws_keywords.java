import java.io.*;
class Student
{
      void studentDetails()throws IOException
      {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please enter student name");
            String sname=br.readLine();
            System.out.println("u r name is:"+sname);
      }
      public static void main(String[] args)throws IOException
      {
            Student s1=new Student();
            s1.studentDetails();
      }
};