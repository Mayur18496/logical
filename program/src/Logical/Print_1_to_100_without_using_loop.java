package Logical;

public class Print_1_to_100_without_using_loop 
{
	

	public static void main (String [] args)
	{
		int  number=1;
		printnumbers(number);
		
	}
		public static void printnumbers(int num)
		{
		       if(num<=100)
		{
			System.out.println(num + "");
			printnumbers(num+1);
			
		}
		
		
	


		
	}
}
