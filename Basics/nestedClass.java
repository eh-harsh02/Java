class nestedClass{
private String str = "LPU";
class nestedClass
{
void display()
{
System.out.println("University is: "+str);
}
}
public static void main(String... args){
nestedclass nestedClass = new nestedClass();
inner obj2 = obj1.new inner();
obj2.display();
}
}
