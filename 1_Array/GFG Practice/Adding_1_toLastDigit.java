/*http://practice.geeksforgeeks.org/problems/adding-one/0


Given a non-negative number represented as an array of digits, add 1 to the number
 ( increment the number represented by the digits ). The digits are stored such that the
  most significant digit is at the head of the list.
  
Example: 

Input:
2
4
5 6 7 8
3
9 9 9
Output:
5 6 7 9
1 0 0 0   
*/




import java.util.*;
import java.lang.*;
import java.io.*;

class Adding_1_toLastDigit{
	public static void main (String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        for(int k=0; k<n; k++){
                  int len = sc.nextInt();
                  int arr[] = new int[len];
                  for(int j=0; j<len; j++){
                       arr[j] = sc.nextInt();
                  }
	                 int carry = 0 , i = len-1;
                  if(arr[i] != 9)
                        arr[i]+=1;
                  else
                  {      
                        while(i>=0 && arr[i]==9){
                              arr[i]=0;
                              i--;
                        }  
                        if(i == -1){
                              carry =1;
                        }
                        else
                              arr[i]+=1;
	               }
                  if(carry==1)
                  System.out.print(carry+" ");
                  for(int num : arr)
                        System.out.print(num+" ");
                  System.out.println();
           }
	}
}