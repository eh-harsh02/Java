interface employee
{
default void show()
{
System.out.println("Display Method");
}
static void display()
{
System.out.println("Static method");
}
void abs();
}
class interfaceDefaultSaticMethod implements employee
{
public void abs()
{
System.out.println("Abstract class");
}
public static void main(String... args){
interfaceDefaultSaticMethod obj = new interfaceDefaultSaticMethod();
obj.abs();
obj.show();
employee.display();// it belongs to employee interface 
}
}