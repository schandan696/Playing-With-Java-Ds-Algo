import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
      static void lex(String a){
               String tok = "";
               String str = "";
               boolean st = false;
               char arr[] = a.toCharArray();
               for(int i=0; i<arr.length; i++){
                     tok += arr[i];
                     if(tok.equals(" ")){
                        tok = "";
                        }                        
                     else if(tok.equals("print")){
                        System.out.println("Found a Print");
                        tok = "";
                        }
                     else if(tok.equals("\"")){
                           if(st == false){
                              st = true;}
                           else if(st == true){
                                 System.out.println("Found A String");
                                 str = "";
                                 st = false;
                           }
                     }
                     else if (st == true){
                           str += arr[i];
                           tok = "";
                           }      
               }
      }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        lex(s);
       // System.out.println(s);   
        in.close();
    }
}
