import java.io.*;
import java.io.Serializable;
public class emp implements Serializable
{
      String s;
      int age;
          public emp(int age, String s)
      {
            this.s =s;
            this.age = age;
      }
     public void show()
      {
            System.out.println(s+age);
      }
}