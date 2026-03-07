import java.util.Scanner;
class singleInheritance
{
Scanner scn = new Scanner(System.in);
//System.out.println("Enter Employee name: ");
String name = scn.nextLine();
//System.out.println("Enter Employee Salary: ");
float salary = scn.nextFloat();
//System.out.println("Enter Employee Designation: ");
String desig = scn.next();
}
class singleInheritance extends employee
{
void bonus()
{
Scanner scn = new Scanner(System.in);
//System.out.println("Enter Employee bonus: ");
double increment = scn.nextDouble();
System.out.println(increment);
}
}
class singleInheritance
{
public static void main(String... args)
{
promotion p = new promotion();
System.out.println("Employe Name:- "+p.name);
System.out.println("Employe Salary:- "+p.salary);
System.out.println("Employe Designation:- "+p.desig);
p.bonus();
}
}
