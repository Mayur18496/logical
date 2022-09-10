package Logical;

public class No_Of_Spaces_IN_String {

	public static void main(String[] args)
	{
		String s = "a b s d f g";
		int count = 0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			
			if(ch==' ')
			{
				count++;
			}
			
		}
		
		System.out.println(count);

	}

}
