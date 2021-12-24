import java.util.Scanner;
public class Sum
{
public static void main (String [] arg)
{
Scanner input =new Scanner(System.in);
int number1;
int number2;
System.out.println(" enter first number ");
number1 = input.nextInt();
System.out.println(" enter second number ");
number2 =input.nextInt();
System.out.println("sum of number1 and number2 is : "  +( number1 + number2));
System.out.println("product of number1 and number2 is :" +( number1 * number2));
System.out.println("difference  of number1 and number2 is : " + (number1 - number2));
System.out.println("quotient of number1 and number2 is : " + (number1 / number2));
}
}
