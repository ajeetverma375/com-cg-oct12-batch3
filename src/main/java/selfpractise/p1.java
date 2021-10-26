package selfpractise;
class b
{
	private int fun()	{		return 0;	}
	public int run()	{		return 3;	}
	}
class d extends b
{
	private int fun()	{		return 1;	    }
	public int run()	{		return fun();	}
}

public class p1 extends d
{
	public int fun()	{		return 2;	}
	public static void main(String[] args)
	{
		b r=new p1();
		System.out.println(r.run());
	}

}
