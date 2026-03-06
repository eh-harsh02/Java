class nestedClass{
private String str = "LPU";
class inner
{
void display()
{
System.out.println("University is: "+str);
}
}
public static void main(String... args){
nestedClass obj1 = new nestedClass();
inner obj2 = obj1.new inner();
obj2.display();
}
}