package P2;
import P1.*;
import java.util.Scanner;
public class CalculatorMain {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your First value");
		int v1=s.nextInt();
		System.out.println("Enter Your Second value");
		int v2=s.nextInt();
		
		System.out.println("Select Your operation");
		System.out.println("1.Additon\n2.Substraction\n3.Multiplication\n4.Division");
		System.out.println("Enter Your choice");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1: Add ad=new Add();
		         int r1=ad.calculate(v1, v2);
		         System.out.println("Addition is="+r1);
			     break;
		case 2: Sub sb=new Sub();
		       int r2=sb.calculate(v1, v2);
		       System.out.println("Substraction is="+r2);
			   break;
		case 3:Mult mt=new Mult();
		     int r3=mt.calculate(v1, v2);
		     System.out.println("Multiplication is=" +r3);
			break;
		case 4:Div dv=new Div();
		     int r4=dv.calculate(v1, v2);
		     System.out.println("Division is="+r4);
			break;
			
			default: System.out.println("Invalid Choice.....");
		
		}
	}

}
