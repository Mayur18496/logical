package Logical;

public class Duplicate_Element_In_Array {

	public static void main(String[] args) 
	{
		String s[] = {"java","c","c++","python","java","c"};
		
		for (int i=0;i<s.length;i++)
		{
			for (int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					System.out.println("found duplicate value:"+ s[i]);
				}
			}
			
		}

	}

}
