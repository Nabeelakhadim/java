import java.util.Scanner;
public class Zero
{
public static void main (String []arg)
{
Scanner input = new Scanner(System.in);
int numberfirst;
int numbersecond;
int numberthird;
int numberforth;
int numberfifth;

System.out.print(" enter first number : ");
numberfirst = input.nextInt();
System.out.print(" enter second number : ");
numbersecond = input.nextInt();
System.out.print(" enter third number : ");
numberthird = input.nextInt();
System.out.print(" enter forth number : ");
numberforth = input.nextInt();
System.out.print(" enter fifth number : ");
numberfifth = input.nextInt();
if(numberfirst == 0 && numbersecond == 0 && numberthird == 0 && numberforth == 0 && numberfirst ==0)
System.out.println(" number is zero");
if(numberfirst < 0 && numbersecond < 0 && numberthird < 0 && numberforth < 0 && numberfirst <0)
System.out.println(" number is negative number");
if(numberfirst >0 && numbersecond >0 && numberthird > 0 && numberforth > 0 && numberfirst >0)
System.out.println(" number is postive number");
}
}

