/*http://practice.geeksforgeeks.org/problems/consecutive-elements/0


 For a given string delete the elements which are appearing more
than once consecutively. All letters are of lowercase. 


Example:
Input:
1
aababbccd

Output:
ababcd
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Remove_redundent_char{
	public static void main (String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        for(int i=0; i<n; i++){
	                String str = sc.next();   
                   char cr[] = str.toCharArray(); 
                   int len = cr.length;
                   for(int j=0; j<len-1; j++){
                        if(cr[j] == cr[j+1]){
                              cr[j+1] ='*';                       }
                   }
                   for(char c : cr){
                        if(c!='*')
                              System.out.print(c);
                   }
              System.out.println();           
	        }
	}
}