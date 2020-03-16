/* http://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix/0 

Traverse a 4x4 matrix of integers in spiral form.
Input:
1
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int inputs = sc.nextInt();
	        int arr[][] = new int[4][5];
	        for(int i=0; i<inputs; i++){
	                for(int j=0; j<4; j++){
	                        for(int k=0; k<4; k++){
	                                arr[j][k] = sc.nextInt();
	                        }
	                }
	            Spiral(4,4,arr);
	        }
	}
	static void Spiral(int m,int n, int a[][]){ 
	     int i, k = 0, l = 0;
        while (k < m && l < n)
        {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i)
            {
                System.out.print(a[k][i]+" ");
            }
            k++;
  
            // Print the last column from the remaining columns 
            for (i = k; i < m; ++i)
            {
                System.out.print(a[i][n-1]+" ");
            }
            n--;
  
            // Print the last row from the remaining rows */
            if ( k < m)
            {
                for (i = n-1; i >= l; --i)
                {
                    System.out.print(a[m-1][i]+" ");
                }
                m--;
            }
  
            // Print the first column from the remaining columns */
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
                    System.out.print(a[i][l]+" ");
                }
                l++;    
            }        
        }
	    System.out.println();
	} 
}