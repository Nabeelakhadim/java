import java.util.Scanner;
public class Add
{
public static void main (String [] arg)
{
Scanner  input = new Scanner(System.in);
int number1;
int number2;
int number3;
int sum;
int product;
int smallest;
int largest;
int average;
System.out.println("enter first number");
number1 = input.nextInt();
System.out.println("enter second number");
number2 = input.nextInt();
System.out.println("enter third number");
number3 = input.nextInt();


if ( number1 < number2 && number1 < number3)
{
	System.out.println(" Smallest number is number1");
}
	if ( number2 < number1 && number2 < number3)
{
	System.out.println(" Smallest number is number2");
}
if ( number3 < number1 && number3 < number2)
{
	System.out.println(" Smallest number is number3");
}
if ( number1 >number2 && number1 > number3)
{
	System.out.println(" largest number is number1");
}
if ( number2 > number1 && number2 > number3)
{
	System.out.println(" largest number is number2");
}
if ( number3 > number1 && number3 > number2)
{
	System.out.println(" largest number is number3");
}

sum = number1+number2+number3;
product = number1*number2*number3;
average = sum/3;
System.out.printf("sum %d\n", sum); 
System.out.printf("product %d\n", product); 
System.out.printf("average %d\n", average);
}
} 