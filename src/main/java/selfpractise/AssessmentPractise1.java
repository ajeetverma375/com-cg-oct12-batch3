package selfpractise;

public class AssessmentPractise1 
{
  public static void main(String[] args) {
	m1(10,10);
	m1(10f,10f);
	m1(10,10l);
}
  public static int m1(int a,int b)
  {System.out.println("intint");
	  return 0;
  }
  public static int m1(double a,int b)
  {System.out.println("meth1"+"doubleint");
	  return 0;
  }
  public static int m1(long a,int b)
  {System.out.println("meth2"+"longint");
	  return 0;
  }
  public static int m1(long a,long b)
  {System.out.println("meth3"+"longlong");
	  return 0;
  }
  public static int m1(float a,float b)
  {
	  System.out.println("meth4"+"floatfloat");
	  return 0;
  }
}
