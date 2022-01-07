import java.util.*;

class Experiment10{

	public static void main(String[] args) {    
  Scanner obj = new Scanner(System.in);

	 System.out.println("Enter the number");

	 int a = obj.nextInt();

	 int i,temp=a,d,s=0;

	 while(a!=0)

	 {

	 	d=a%10;

	 	s=(s*10)+d;

	 	a=a/10;

	 }

	 if(temp==s)

	 {

	 	System.out.println("The number "+  temp + "  is a palindrome number");

	 }

	 else

	  {

	  	 System.out.println("The number "+  temp + "  is not palindrome number");

	 }

}

}
