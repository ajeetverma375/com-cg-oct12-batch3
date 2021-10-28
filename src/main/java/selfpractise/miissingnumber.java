package selfpractise;

import java.util.Scanner;

public class miissingnumber {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter length ");
	int n = sc.nextInt();
	int a[] = new int[n];
	for(int i =0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	int sum =0,t,k,d;
	for(int j=0;j<a.length;j++)
	{
	sum=sum+a[j];
	}
	t=a.length+1;
	k=t*(t+1)/2;
	d=k-sum;
	System.out.println(d);
	//sc.close();
	} 
}
