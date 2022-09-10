package Logical;

import java.util.HashMap;
import java.util.Set;

public class logical_prg
{
public static void main(String[] args) {
	

	String org = "abc abc ab ac ab ac abc ad gb wh uj wj";
	
	String [] ar  = org.split(" ");
	
    HashMap<String, Integer> mp = new HashMap<String, Integer> ();
     
    for(int i=0;i<=ar.length-1;i++)
    {
    	String s1 =ar[i];
    	
    	if(mp.containsKey(s1))
    	{
    		mp.put(s1, mp.get(s1)+1);
    	}
    	else
    	{
    		mp.put(s1, 1);
    	}
    }
    
               Set<String> allkeys = mp.keySet();
               
               for (String key  : allkeys)
               {
            	   System.out.println(key+ ":"+ mp.get(key));
               }
      
      
      
      
      
      
      
      
      
      
      
      
      
	
}
}