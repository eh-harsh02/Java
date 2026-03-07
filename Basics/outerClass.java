class outerClass{
private String section = "K22BK";
void show()
{
class inner
{
void display()
{
System.out.println("My section is: "+section);
}
}
inner i = new inner();
i.display();
}
public static void main(String... args){
outerClass obj = new outerClass();
obj.show();
}
}