class patient
{
String name;
int pid;
int page;
void insertrecord(String name, int pid, int page)
{
this.name=name;
this.pid=pid;
this.page=page;
}
void display()
{
System.out.println("Patient details are:- "+name+","+pid+" and "+page+".");
}
}

class thisKeyword
{
public static void main(String... args)
{
patient p=new patient();
p.insertrecord("Kumar",152,75);
p.display();
}
}