public class OneOfEach {
    public static void main(String args[]) {
       int sum=0; int boy=0; int girl=0; 
    double random=Math.random();
    while(boy==0|| girl==0){ 
        if(random<0.5){ 
            boy=boy+1;
			System.out.print("b ");
        }else{ 
            girl=girl+1;
			System.out.print("g ");
        }
        sum=sum+1;
		random=Math.random();
    } 
     System.out.println();
     System.out.println("You made it... and you have "+ sum+ " children.");
    }
}


