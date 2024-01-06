public class DamkaBoard { 
  
  public static void main (String args[]) { 
  
  
     int num= Integer.parseInt(args[0]);
	 
	 
	 for (int i=1;i<=num; i++){ // #feedback - note the indentation here.
	    for (int j=1;j<=num; j++) { 
		    if (i%2==0){ 
		        System.out.print (" *" );
		   }else { 
		        System.out.print("* " );
		       }
		     }
		   System.out.println(""); // #feedback - the empty string "" is not needed, you can call println function with no inputs.
	       }
  
       } 
	 } 
