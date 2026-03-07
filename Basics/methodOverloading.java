class methodOverloading
{
static int add(int a, int b)
{
return a+b;
}
static double add(double a, double b, double c)
{
return a+b+c;
}
static double add(double a, int b)
{
return a+b;
}
public static void main(String[] args)
{
System.out.println(methodOverloading.add(4,5));
System.out.println(methodOverloading.add(8,4,2));
System.out.println(methodOverloading.add(5.44, 5));

}
/*public static void main()
{
System.out.println("First");
}
public static void main(String a)
{
System.out.println("Second");
}
public static void main(String[] args){
System.out.println("Hello!");
}*/
/*long mul(short a, long b){
return a*b;
}
long mul(long a, long b){
return a*b;
}
public static void main(String... args){
methodOverloading obj = new methodOverloading();
System.out.println(obj.mul(4,8));
System.out.println(obj.mul(2,3));
}*/
}