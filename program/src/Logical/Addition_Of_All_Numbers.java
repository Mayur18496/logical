package Logical;

public class Addition_Of_All_Numbers {

	public static void main(String[] args) 
	{
	
		int num = 12345;
		int add = 0 ;
		
		while (num>0)
		{
			add=add+num%10;
			num=num/10;
			
		}
		
		System.out.println(add);

	}

}
