
class ForLoop
{
	 public static void main(String args[])
	 {  
		 
		  int x,y, calc, flag=0; 
		  
		  for (x=3; x<=100; x++) /* loop for numbers 
			  						3 to 100 as 1 and 2 not required to be tested */
		  
		  { 
			  flag = 0;				// check point
								  		  
			  for (y=x-1; y>1; y--)		// loop generating divisor values for value x
				  
			  {
			
				  calc = x%y;		// storing resultant in calc
				  if (calc==0)
									
					 flag = 1;	//flag up if resultant is 0 for any divisor
			  }

					
	if (flag==0)	// condition
		
				System.out.print(" "+x);
		  }
		  
		}		 
		
}