import java.util.Scanner;
public class AccountTest
{
public static void main(String[] arg)
{
Scanner input = new Scanner(System.in);
Account myAccount =new Account();
System.out.printf(" inital name is : %s%n%n", myAccount.getName());
System.out.println("please enter the name");
String theName = input.nextLine();
myAccount.setName(theName);
System.out.println();
 System.out.printf("name in object myAccount is %n%s%n",myAccount.getName());
 }
 }