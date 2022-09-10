package Logical;

public class armstrong
{

	public static void main(String[] args)
	{
		
		
		int num = 153;
		
		int arm = 0;
		
		int r =0;
		
		while(num>0)
		{
			r=num%10;
			arm=arm+(r*r*r);
			num=num/10;
		}
		
		//System.out.println(arm);
		
		if(arm==num)
		{
			System.out.println("the given no is not armstrong");
		}
		else 
		{
			System.out.println("the given no is  armstrong");
		}
		
	}
}
