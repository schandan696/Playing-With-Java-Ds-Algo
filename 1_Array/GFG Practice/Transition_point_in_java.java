/*
http://practice.geeksforgeeks.org/problems/find-transition-point/1

You are given a sorted array containing only numbers 0 and 1. Find the transition point efficiently.
 Transition point is a point where "0" ends and "1" begins.

Example:
Input
1
5
0 0 0 1 1

Output
3


Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


class GfG
{
	int transitionPoint(int arr[],int n)
	{
	    for(int i=0; i<n; i++){
	        if(arr[i] == 1)
	            return i;
	    }
	   return -1;
    } 
}
