import java.util.Scanner;
public class Larger
{
public static void main (String []arg)
{
Scanner input = new Scanner(System.in);
int number1;
int number2;
System.out.println(" enter first number1 ");
number1 = input.nextInt();
System.out.println(" enter second number2 ");
number2 = input.nextInt();
if (number1 == number2)
{
System.out.println(" These numbers are equal");
}
if (number1 > number2)
{
System.out.println(" number1 is larger");
}
if (number1 < number2)
{
System.out.println(" number2 is larger");
}
}
}