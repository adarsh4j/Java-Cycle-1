import java.util.*;

class Experiment7{

	public static void main(String[] args) {  
  Scanner obj = new Scanner(System.in);

	 System.out.println("Enter the number");

	 int a = obj.nextInt();

	 int i,n1=0,n2=1,fib;

	 System.out.println("The fibanocii series is");

	 System.out.println(n1);

	 System.out.println(n2);

	 for(i=2;i<=a;i++)

	 {

	 	fib=n1+n2;

	 	System.out.println(fib);

	 	n1=n2;

	 	n2=fib;

	 }

	}

}
