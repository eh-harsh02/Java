import java.util.*;
class RelationOpt{
public static void main(String []args){
int a,b,choice;
System.out.println("Enter the choices:- 1. Less than, 2. Less than equals to, 3. More than, 4. More than equals to, 5. Equals to, 6. Not Equals to");
Scanner sc = new Scanner(System.in);
System.out.println("Enter your choices:- ");
choice = sc.nextInt();
System.out.println("Enter first number:- ");
a=sc.nextInt();
System.out.println("Enter second number:- ");
b=sc.nextInt();
switch(choice){
case 1:
boolean c=a<b;
System.out.println("a is less than b:- " + c);
break;
case 2:
c=a<=b;
System.out.println("a is less than equals to b:- " + c);
break;
case 3:
c=a>b;
System.out.println("a is More than b:-" + c);
break;
case 4:
c=a>=b;
System.out.println("a is More than equals to b:-" + c);
break;
case 5:
c=a==b;
System.out.println("a is Equals to b:- " + c);
break;
case 6:
c=a!=b;
System.out.println("a is Not equals to b:- " + c);
break;
default:
System.out.println("Invalid Choices");

}
}
}