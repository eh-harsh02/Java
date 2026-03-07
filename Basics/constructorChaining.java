class constructorChaining
{
chaining()
{
this(5);
System.out.println("Default constructor");
}

chaining(int x)
{
this(4,5);
System.out.println("One parameter");
}
chaining(int x, int y)
{
this(4,8,9);
System.out.println("Two parameter");
}
chaining(int a, int b, int c)
{
System.out.println("Three parameter");
}
}

class constructorChaining
{
public static void main(String... args)
{
chaining obj = new chaining();
}
}
