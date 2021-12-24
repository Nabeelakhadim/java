import java.util.Scanner;
public class Smallest
{
public static void main(String [] args)
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

if(numberfirst > numbersecond && numberfirst > numberthird && numberfirst > numberforth && numberfirst > numberfifth)
System.out.println("number first is larger ");
if(numberfirst < numbersecond && numberfirst < numberthird && numberfirst < numberforth && numberfirst < numberfifth)
System.out.println("number first is smallest ");
if(numbersecond > numberfirst && numbersecond > numberthird && numbersecond > numberforth && numbersecond > numberfifth)
System.out.println("number second is larger ");
if(numbersecond < numberfirst && numbersecond < numberthird && numbersecond < numberforth && numbersecond < numberfifth)
System.out.println("number second is smallest ");
if(numberthird < numberfirst && numberthird < numbersecond && numberthird < numberforth && numberthird < numberfifth)
System.out.println("number third is smallest ");
if(numberthird > numberfirst && numberthird > numbersecond && numberthird > numberforth && numberthird > numberfifth)
System.out.println("number third is larger ");
if(numberforth < numberfirst && numberforth < numbersecond && numberforth < numberthird && numberforth < numberfifth)
System.out.println("number forth is smallest ");
if(numberforth > numberfirst && numberforth > numbersecond && numberforth > numberthird && numberforth > numberfifth)
System.out.println("number forth is larger ");
if(numberfifth < numberfirst && numberfifth < numbersecond && numberfifth < numberthird && numberfifth < numberforth)
System.out.println("number fifth is smallest ");
if(numberfifth > numberfirst && numberfifth > numbersecond && numberfifth > numberthird && numberfifth > numberforth)
System.out.println("number fifth is larger ");
}
}