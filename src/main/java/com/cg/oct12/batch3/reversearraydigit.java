package com.cg.oct12.batch3;
import java.util.ArrayList;
import java.util.Collections;

public class reversearraydigit 
{ 	static int reversDigits(int num)
	{
	    int rev_num = 0;
	    while (num > 0)
	    {
	        rev_num = rev_num * 10 + num % 10;
	        num = num / 10;
	    }
	    return rev_num;
	}

	static void sortArr(int arr[], int n)
	{	     ArrayList<int[]> vp = new ArrayList<>();
	   	    // Inserting reverse with elements in the vector pair
	    for(int i = 0; i < n; i++)
	    {
	        vp.add(new int[]{reversDigits(arr[i]),arr[i]});
	    }
	   
	    // Sort the vector, this will sort the pair according to the reverse of elements
	    Collections.sort(vp, (a, b) -> a[0] - b[0]);
	   
	    // Print the sorted vector content
	    for(int i = 0; i < vp.size(); i++)
	        System.out.print(vp.get(i)[1] + " ");
	}
	  
	// Driver code
	public static void main(String[] args)
	{
	    int arr[] = { 12, 10, 102, 31, 15 };
	    int n = arr.length;
	     
	    sortArr(arr, n);
	}

}
