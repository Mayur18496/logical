package Logical;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int num1 = scan.nextInt();
		
		System.out.println(num1+10);

	}

}
