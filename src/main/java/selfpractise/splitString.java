package selfpractise;

public class splitString 
{
   
		public static void main(String args[])   
		{   
		String str1 = "468-567-7388";  
		String str2 = "Liyfe,iys,youyr,creyatyion";  
		String str3 = "Hello! ho!w are! you?";  
		String[] stringarray1 = str1.split("8",3);  
		
		System.out.println("When the limit is positive:");  
		System.out.println("Number of tokens: "+stringarray1.length);  
		System.out.println(str1);
		for(int i=0; i<stringarray1.length; i++)  
		{  
		System.out.println(stringarray1[i]);  
		}  
		String[] stringarray2 = str2.split("y",-1);   
		System.out.println("\nWhen the limit is negative: ");  
		System.out.println("Number of tokens: "+stringarray2.length);  
		System.out.println(str2);
		for(int i=0; i<stringarray2.length; i++)  
		{  
		System.out.println(stringarray2[i]);  
		}  
		String[] stringarray3 = str3.split("!",0);   
		System.out.println("\nWhen the limit is equal to 0:");  
		System.out.println("Number of tokens: "+stringarray3.length);  
		for(int i=0; i<stringarray3.length; i++)  
		{  
		System.out.println(stringarray3[i]);  
		}  
		}   

}
