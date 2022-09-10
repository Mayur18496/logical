package Logical;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Set;

public class logical_findduplicate 
{
	
	public static void main(String[] args)
	{
		String org ="abcabcab";
		
		
		HashMap<Character,Integer>  mp = new HashMap<Character,Integer> ();
		for (int i=0;i<=org.length()-1;i++)
			
		{
			char s1 = org.charAt(i);
			
			if(mp.containsKey(s1))
			{
				
				mp.put(s1,mp.get(s1)+1);
			}
			else 
			{
				mp.put(s1, 1);
			}
		}
		
		         Set<Character> allkeys = mp.keySet();
		         
		        for( Character keys   :    allkeys) 
		        
		        {
		        	
		  System.out.println(keys + " : "+ mp.get(keys));
		      
		        }
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		         
		}


}
