class employee
{
String name;
int empid;
static String company="TCS"; // static variable
employee(String n, int id)
{
name = n;
empid=id;
}
static void companyChange() // static method
{
company="Wipro";
}
public String toString()
{
return "Employe name:- "+name + " employee id:- " +empid+ " and employee company :- " +company+".";
}
}
class StaticMethod
{
public static void main(String []args)
{
employee e1=new employee("Harsh", 123);
System.out.println(e1);
employee.companyChange(); // Calling the static method function
employee e2=new employee("Aman", 456);
System.out.println(e2);
employee e3=new employee("Raj", 789);
System.out.println(e3);
}
}