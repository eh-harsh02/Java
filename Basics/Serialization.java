import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
class employee implements Serializable
{
String name;
char gender;
int age;
employee(String name,char gender,int age)
{
this.name=name;
this.gender=gender;
this.age=age;
}
String tostring()
{
return "name is :- "+name+ ", gender of employee is:- "+gender+ "age is :- "+age+ ".";
}
}
class Serialization
{
public static void main(String shruti[])
{
try
{
employee eobj=new employee("Shruti",'F',8);
System.out.println("object 1:-" + eobj);
FileOutputStream fobj=new FileOutputStream("D:\\K22BK\\secondobject.doc");
ObjectOutputStream obj=new ObjectOutputStream(fobj);
obj.writeObject(eobj);
obj.flush();
obj.close();
}
catch(Exception e)
{
System.out.println(e);
}
try
{
employee obj2;
FileInputStream fin=new FileInputStream("D:\\K22BK\\secondobject.doc");
ObjectInputStream finobj=new ObjectInputStream(fin);
obj2=(employee)finobj.readObject();
finobj.close();
System.out.println(obj2);
}
catch(Exception e)
{
e.getMessage();
}
}
}