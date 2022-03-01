import java.util.*;

class Experiment9{

	public static void main(String[] args) {      Scanner obj = new Scanner(System.in);

	 System.out.println("Enter the number");

	 int a = obj.nextInt();

	 int i,temp=a,d,digit=0;

	 double s=0;

     while(a>0)

        {

            a = a/10;

            digit++;

        }

        a=temp;

	 while(a!=0)

	 {

	 	d=a%10;

	 	s=s+Math.pow(d,digit);

	 	a=a/10;

	}

	if(temp==s)

	{

		System.out.println("The number "+temp+" is an armstrong number");

	}

	else

	{

		System.out.println("The number"+temp+" is not an armstrong number");

	}

}

}
