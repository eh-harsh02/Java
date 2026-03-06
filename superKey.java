class employee
{
int empid;
String empname;
employee(int empid, String empname){
this.empid=empid;
this.empname=empname;
}
}

class record extends employee
{
float sal;
record(int empid, String empname, float sal)
{
super(empid,empname);
this.sal=sal;
}
void show()
{
System.out.println("Employee detail: "+empid+","+empname+" and "+sal+".");
}
}

class superKey
{
public static void main(String... args){
record r=new record(125,"Aman",78954);
r.show();
record r1=new record(126,"Ram",58946);
r1.show();
}
}