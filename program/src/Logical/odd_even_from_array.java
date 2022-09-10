package Logical;

public class odd_even_from_array {

	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5,6};
		
		System.out.println("Even number in array ------>");

		for(int value : a)
		{
			if(value%2==0)
			System.out.println(value);
		}
		
		System.out.println("odd number in array ------>");
		
		for (int value :a )
		{
			if(value%2!= 0)
				System.out.println(value);
		}
		
		
	}

}
