package star;

public class p5 {

	public static void main(String[] args)
	{
		
		  /*                  *
                            * *
                          * * *                    row=6 ,column=6
                        * * * *
                      * * * * *
	                * * * * * *               
	                  * * * * *                         
	                    * * * *                                 
	                      * * *                                 
	                        * *   
	                          *                                       */

int star = 1;
int space = 5;

for (int i=1;i<=11;i++)
{
	for (int j=1 ;j<=space;j++)
	{
		System.out.print(" ");
	}
for (int k=1;k<=star;k++)
{
	System.out.print("*");

}
System.out.println();


 if(i<6)
 {
	 star++;
	 space--;
 }
 else
 {
	 star--;
	 space++;
 }

}	

	}

}
