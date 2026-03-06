class instanceInitializerBlock{
instanceInitializerBlock()
{
System.out.println("Default constructor");
}
{
System.out.println("First instance initializer Block");
}
static
{
System.out.println("First static instance initializer block");
}
static
{
System.out.println("Second static instance initializer block");
}
public static void main(String... args){
instanceInitializerBlock obj = new instanceInitializerBlock();
instanceInitializerBlock obj1 = new instanceInitializerBlock();
}
}