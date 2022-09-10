package Logical;

public class Palindrom_String 
{
	public static void main(String[] args) 
	{
	
		String org = "madam";
		String rev = "";
		
		for (int i=org.length()-1;i>=0;i--)
		{
			rev = rev + org.charAt(i);
		}
		
		System.out.println(rev);
		
		if(org.endsWith(rev))
		{
			System.out.println("the given string is palindrom");
		}
		else 
		{
			System.out.println("the given string is  not palindrom");
		}
		

	}

}
