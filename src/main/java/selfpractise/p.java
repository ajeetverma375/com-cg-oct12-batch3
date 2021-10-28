package selfpractise;

public class p {
public static void main(String[] args) {

String str ="aa11b33";

int len = str.length();
int sum = 0;
String tmp = "";
for (int i = 0; i < len; i++)
{
if (Character.isDigit(str.charAt(i)))
  {
System.out.println(str.charAt(i)+" i : "+i+" len : "+len+" len-1 : "+(len-1));

    if (i < len-1 && Character.isDigit(str.charAt(i+1)))
    {
   
     tmp += str.charAt(i);
    }
    else  
    {
    tmp += str.charAt(i);
    sum += Integer.parseInt(tmp);
    tmp = "";
    }
  }
}
System.out.println(sum);
}
}
