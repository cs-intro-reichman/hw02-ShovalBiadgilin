import java.util.Random;

public class OneOfEachStats { 
  public static void main (String args[]) { 
  double sum=0; int girl=0; int boy=0; 
  int count2=0; int count3=0; int count4=0;
  double total=0;
  int T= Integer.parseInt(args[0]);
  int seed=Integer.parseInt(args[1]);
  Random generator = new Random(seed); 
  
  for (int i=0; i<T; i++) { 
  double random= generator.nextDouble();
      while(girl==0||boy==0) { 
	       if (random<0.5){
			  boy++;
		   }else { 
				 girl++;
			} 

			sum=sum+1;
			random=generator.nextDouble();
		   } 
		   total=total+sum;
		  
		   if (sum==2){ 
		      count2++;
		   }else if(sum==3) { 
		      count3++;
		   }else{
			   count4++;
                }
             
       sum=0; girl=0; boy=0;
  }
	   
	  System.out.println("Average: " +(total/T)+ " children to get at least one of each gender.");
      System.out.println("Number of families with 2 children: " + count2);
	  System.out.println("Number of families with 3 children: " + count3);
	  System.out.println("Number of families with 4 or more children: " + count4);
	  
	  
	      if (count2>count3 && count2>count4){ 
	           System.out.println("The most commom number of children is 2.");
	     } else if  (count3>count2 && count3>count4){ 
		        System.out.println("The most commom number of children is 3.");
	     } else if (count4>count3 && count4>count2){
               System.out.println("The most common number of children is 4 or more.");	  
		         
	  }
	  
  } 
} 

