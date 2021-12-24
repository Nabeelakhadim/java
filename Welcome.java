 import java.util.Scanner;
 public class Welcome
{
	//main method begins execution of java application
	
		public static void main (String arg[])
		{
			Scanner input = new Scanner(System.in);
			int number1;
			int number2;
			int sum;
			System.out.print("Enter first integer  ");
			number1=input.nextInt();
			System.out.print("Enter second integer  ");
			number2=input.nextInt();
			sum=number1+number2;
			System.out.printf("Sum is %d%n",sum);
		}			
			
}
