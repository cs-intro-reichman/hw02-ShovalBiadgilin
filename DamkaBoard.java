public class DamkaBoard { 
  
  public static void main (String args[]) { 
  
  
     int num= Integer.parseInt(args[0]);
	 
	 
	 for (int i=1;i<=num; i++){ 
	    for (int j=1;j<=num; j++) { 
		    if (i%2==0){ 
		        System.out.print (" *" );
		   }else { 
		        System.out.print("* " );
		       }
		     }
		   System.out.println("");	
	       }
  
       } 
	 } 