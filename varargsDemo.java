class varargsDemo
{
static void show(int a, String... s)
{
System.out.println("Value of mandatory argument is:- " + a);
for(String value:s)
{
System.out.println(value);
}
}

public static void main(String args[])
{
show(76);
show(85, "Hello");
show(42, "Hello", "World");
show(35, "I", "am", "Varargs");
}
}