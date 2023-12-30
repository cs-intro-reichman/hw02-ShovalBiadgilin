public class perfect{
  public static void main (String args[]){ 
  
    int num= Integer.parseInt(args[0]);
	int a=1;
	String str=(num + " is a perfect number since " + num + " = 1" );
	
	for (int i=2; i<num; i++) { 
	    if (num%i==0){ 
	         
		  str= str + " + " + i;
		  a=a+i;
		}
	}
		  if (a==num) { 
		   System.out.println(str); 
		  }else { 
		   System.out.println(num + " is not a perfect number");
		  }
		   
		
		
		
		
		  } 
		} 
		  