package Logical;

public class Find_MIN_Number_in_array {

	public static void main(String[] args) 
	{
		int a[] = {12,45,2,56,774,4,3,1,67,9};
		int min =a[0];

		
		for (int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		
		System.out.println(min);
		
		
	}

}
