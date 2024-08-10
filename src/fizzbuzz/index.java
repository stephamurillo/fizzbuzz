package fizzbuzz;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int controlador=1;
   
   while(controlador<=100) {
	   
 
       if(controlador %3==0 && controlador %5 ==0) {
    	   System.out.println("fizzbuzz.");
    	   
       }   else if (controlador % 3 ==0 ) {  
    	   System.out.println("fizz.");
       }
       else if (controlador % 5 == 0) {  
    	   System.out.println("buzz.");
       }
       else { System.out.println(controlador);
       }
       controlador++;
   }   
   
	}
	
   
}



   
   
	


