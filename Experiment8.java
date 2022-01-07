import java.util.*;

class Experiment8{

	public static void main(String[] args) {     
  Scanner obj = new Scanner(System.in);

	 System.out.println("Enter the number");

	 int a = obj.nextInt();

	 int fact=1;

	 while(a!=0)

	 {

	    fact=fact*(a--);

	 } 

 	 System.out.println("The factorial is "+fact);

	}

}
