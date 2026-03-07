class staticNestedClass 
{
static String uni="LPU";
static class inner
{
void show()
{
System.out.println("My University is:- "+uni);
}
}
public static void main(String... args)
{
inner obj = new staticNestedClass.inner();
obj.show();
staticNestedClass.inner obj1 = new staticNestedClass.inner();
obj1.show();
inner obj3 = new inner();
obj3.show();
}
}