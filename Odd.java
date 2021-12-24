import java.util.Scanner;
public class Odd
{
public static void main (String []arg)
{
Scanner input = new Scanner(System.in);
int number;
System.out.print("enter any number : ");
number = input.nextInt();
if( number%2 ==0)
System.out.println(" this is even number");
if(number%2 != 0)
System.out.println("this is odd number");
}
}

