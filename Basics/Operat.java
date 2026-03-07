import java.util.*;
class Operat{
public static void main(String []args){
int a,b,choice;
System.out.println("Enter Choices:- 1. And Operator, 2. Or Operator, 3. XOR operator, 4.Right Shift, 5. Left Shift, 6. Right Shift filled with zeros");
Scanner sc = new Scanner(System.in);
System.out.println("Enter your choices:- ");
choice = sc.nextInt();
System.out.println("Enter first number:- ");
a=sc.nextInt();
System.out.println("Enter second number:- ");
b=sc.nextInt();
switch(choice){
case 1:
int c=a&b;
System.out.println("And operation on a and b:- "+c);
break;
case 2:
c=a|b;
System.out.println("Or operation on a and b:- "+c);
break;
case 3:
c=a^b;
System.out.println("XOR operation on a and b:- "+c);
break;
case 4:
c=a>>b;
System.out.println("Right Shift operation on a and b:- "+c);
break;
case 5:
c=a<<b;
System.out.println("Left Shift operation on a and b:- "+c);
break;
case 6:
c=a>>>b;
System.out.println("Right Shift operation filled with zeros on a and b:- "+c);
break;
default:
System.out.println("Invalid options");
}
}
}
