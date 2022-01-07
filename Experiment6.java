import java.util.*;

class Experiment6{

	public static void main(String[] args) {   
  Scanner obj = new Scanner(System.in);

	 System.out.println("Enter the number");

	 int a = obj.nextInt();

	 for(int i=1;i<=a;i++)

	 {

	 	if(a%i==0)

	 	{

	 		System.out.println("The factor is "+i);

	 	}

	 }

	 

	}

}
