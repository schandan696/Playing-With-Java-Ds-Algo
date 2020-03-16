import java.util.*;

class BalancePar{
         static boolean isMatchingPair(char c1 , char c2){
               if(c1 == '(' && c2 == ')')
                     return true;
               else if(c1 == '{' && c2 == '}')
                     return true;
               else if(c1 == '[' && c2 == ']')
                     return true;
               else 
                     return false;
         }
         boolean areBalance(char []exp){
               Stack s = new Stack();
               for(int i = 0; i<exp.length; i++){
                     if(exp[i] == '(' || exp[i] == '{' || exp[i] == '[')
                           s.push(exp[i]);
                     
                     if(exp[i] == ')' || exp[i] == '}' || exp[i] == ']')
                           {
                              if(s.empty())
                                    return false;
                              else if( ! isMatchingPair((char)s.pop(), exp[i]) )
                                    return false;
                           }
               }
              if (s.isEmpty())
                  return true;                {  
                     return false;
               }        
         }
         public static void main(String argv[]){
               BalancePar b = new BalancePar();
               char exp[] = {'{','(',')','}','[',']'};
               if(b.areBalance(exp))
                     System.out.println("Balanced");
               else
                     System.out.println("Not Balanced");
         }
};