import java.util.Scanner;
class person
{
static int studentid = 100;
String name;
String add;
Long contact;
void detail(){}
void display(){}
}
class student extends person
{
void detail()
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter student name:- ");
name = scn.nextLine();
System.out.println("Enter address:- ");
add = scn.next();
System.out.println("Enter contact:- ");
contact = scn.nextLong();
}
void display()
{
studentid+=studentid;
System.out.println("Roll no. of Student:- "+studentid);
System.out.println("Name:- "+name);
System.out.println("Address:- "+add);
System.out.println("Contact:- "+contact);
}
}

class faculty extends person
{
static int fid=200;
char rank;
float sal;
void detail()
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter Salary:- ");
float sal = scn.nextFloat();
System.out.println("Enter rank:- ");
rank = scn.next().charAt(0);
}
void display()
{
fid+=fid;
System.out.println("Faculty Id:- "+fid);
System.out.println("Faculty Name:- "+name);
System.out.println("Faculty Address:- "+add);
System.out.println("Faculty Contact:- "+contact);
}
}


class collegeManagementSystem
{
public static void main(String... args)
{
Scanner scn = new Scanner(System.in);
student s = new student();
faculty f = new faculty();
boolean exit = false;
do{
System.out.println("Enter Choice:- ");
System.out.println("1. Student");
System.out.println("2. Faculty");
System.out.println("3. Choice")
int choice = scn.nextInt();
switch(choice)
{
case 1:
s.detail();
s.display();
break;
case 2:
f.detail();
f.display();
break;
case 3:
exit=true;
break;
default:
System.out.println("Invalid choice");
break;
}
}
while (!exit){
}
}
}