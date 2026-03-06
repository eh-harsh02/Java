class abc
{
void display()
{
System.out.println("I am display method.");
}
void show()
{
this.display();
System.out.println("I am show method.");
}
}

class demo
{
public static void main(String... args)
{
abc obj = new abc();
obj.show();
}
}