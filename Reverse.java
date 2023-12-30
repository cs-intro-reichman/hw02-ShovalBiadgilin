public class Reverse { 

  public static void main (String args[]) { 
    
	String str= args[0];
   int last= str.length();
   String newString="";
   
   
   while (last>0){
    newString= newString + str.charAt((last-1));
	last=last-1;

	
   }
    System.out.println(newString);
	
	
	
	last=str.length();
	  if(last%2==0){ 
     		 System.out.println("The middle character is " + str.charAt((last/2)-1));
	  
	  }else{ 
	      	 System.out.println("The middle character is " + str.charAt(last/2));
	  }
	      
  } 
}
	
	
	