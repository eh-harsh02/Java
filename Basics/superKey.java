class superKey
{
int empid;
String empname;
employee(int empid, String empname){
this.empid=empid;
this.empname=empname;
}
}

class superKey extends employee
{
float sal;
Record(int empid, String empname, float sal)
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
Record r=new Record(125,"Aman",78954);
r.show();
Record r1=new Record(126,"Ram",58946);
r1.show();
}
}
