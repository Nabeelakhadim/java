import java.util.Scanner;
public class Even
{
public static void main (String []arg)
{
 Scanner input = new Scanner(System.in);
int number;
int number1;
int number2;
int number3;
int number4;
int number5;
System.out.println("enter any five number");
number = input.nextInt();
 number1 = number /10000;
 number2 = number % 10000/1000;
 number3 = number % 10000%1000/100;
 number4 = number  %10000%1000%100/10;
 number5= number % 10000%1000%100%10;
 System.out.printf(" %d  %d  %d  %d  %d   " , number1,number2,number3,number4,number5);
 }
 }
