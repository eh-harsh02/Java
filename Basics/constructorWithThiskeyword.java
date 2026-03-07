class constructorWithThiskeyword
{
String name;
int pid;
int page;
String pdisease;
String drname;
patient(String name, int pid, int page)
{
this.name=name;
this.pid=pid;
this.page=page;
}

patient(String name, int pid, int page, String pdisease, String drname)
{
this(name,pid,page);
this.pdisease=pdisease;
this.drname=drname;
}

void display()
{
System.out.println("Patient details are:- "+name+","+pid+","+page+","+pdisease+" and "+drname+".");
}
}

class constructorWithThiskeyword
{
public static void main(String... args)
{
patient p=new patient("Kumar",452,58);
p.display();
patient p1=new patient("Kumar",452,58,"Fever","Vicky");
p1.display();
}
}
