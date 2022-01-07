import java.util.*;

class Experiment4{

	public static void main(String[] args) {	
   Scanner obj = new Scanner(System.in);

	 System.out.println("Enter the number");

	 int a = obj.nextInt();

	 int i,f=0;

	 for(i=2;i<=(a/2);i++)

	 {

	 	if(a%i==0)

	     {

	     	f=1;

	     	break;

	     }

	 }

	 if(f==1)

	 {

	 	System.out.println(a+" is a prime");

	}

	 else

	  {

	  	System.out.println(a+" is not a prime");

	  }

	}

}
