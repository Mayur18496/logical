package Logical;

public class Remove_special_character_from_string {

	public static void main(String[] args)
	{
		String s = "sasfgddjdjd oddh!!!!@#$%^&hfhfhf";
		
		
		String s1 = s.replaceAll("\\p{Punct}", "");
		
		String s2 = s.replaceAll("\\P{Punct}", "");
		
		System.out.println("string character : "+s1);
		
		System.out.println("special character : "+s2);

	}

}
