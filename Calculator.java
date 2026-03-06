import java.util.*;
class Calculator{
public static void main(String args[])
{
int a,b,choice;
System.out.println("Enter choice:- 1. Addition, 2. Subtraction, 3. Multiplication, 4. Division, 5. Modulo");
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:- ");
a=sc.nextInt();
System.out.println("Enter second number:- ");
b=sc.nextInt();
System.out.println("Enter choice:- ");
choice=sc.nextInt();
switch(choice)
{
case 1:
int c=a+b;
System.out.println("Addition result is:- "+c);
break;
case 2:
c=a-b;
System.out.println("Subtraction result is:- "+c);
break;
case 3:
c=a*b;
System.out.println("Multiplication result is:- "+c);
break;
case 4:
c=a/b;
System.out.println("Division result is:- "+c);
break;
case 5:
c=a%b;
System.out.println("Modulo result is:- "+c);
break;
default:
System.out.println("Invalid Choice");
break;
}
}
}