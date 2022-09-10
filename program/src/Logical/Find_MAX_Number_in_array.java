package Logical;

public class Find_MAX_Number_in_array {

	public static void main(String[] args) 
	{
	
		int [] a = {1,27,83,87,39,20,67};
		int max = a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println(max);

	}

}
