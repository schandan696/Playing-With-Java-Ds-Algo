import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
        

class TestClass {
    static void eva(String []ar){
       for(int i=0; i<ar.length; i++){
        
       }
    } 
    
    static int add(int a, int b){
         return a+b;
    }
    static int sub(int a, int b){
         return a-b;
    }
    static int mul(int a, int b){
         return a*b;
    }
    static int div(int a, int b){
         return a/b;
    }
    
    
    public static void main(String args[] ) throws Exception{
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String ar[] = new String[N];
        for (int i = 0; i < N; i++) {
            ar[i] =bf.readLine();
        }      
   }
}