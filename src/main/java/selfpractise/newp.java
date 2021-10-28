package selfpractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class newp {
	public static void main(String[] args) {
	abcde ref=new abcde();
		System.out.println(ref.ma(4));
		ArrayList<Integer> gfg = new ArrayList<>(
	            Arrays.asList(10,25,33,28,10,12));
	 System.out.println(ref.rev(gfg));
	 System.out.println(ref.change(gfg,28,20));
	    
	}

 }

class abcde
{
	public ArrayList<Integer> ma(int n)
	{
	ArrayList<Integer> a=new ArrayList<Integer>();
	if(n==4)
	{
		a.add(0);a.add(0);a.add(0);a.add(0);
		}
	return a;

	}


	public ArrayList<Integer>  rev(ArrayList<Integer> gfg)
	{  Collections.reverse(gfg);
	return 	gfg;
	}
	public ArrayList<Integer>  change(ArrayList<Integer> gfg,int m,int n)
	{  Collections.replaceAll(gfg,m,n);
	return 	gfg;
	}}