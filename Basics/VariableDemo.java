class VariableDemo{
long l = 34589; // instance variable
static void add()
{
int i = 5; // local Variable
System.out.println(i);
int a = 40;
int b = 50;
byte c = (byte)(a+b);
System.out.println("Addition:- "+c);
byte x = 23;
byte y = 78;
long z = x+y;
System.out.println("Addition:- "+z);
}
public static void main(String []args){
VariableDemo obj = new VariableDemo();
System.out.println(obj.l);
add();
byte b1=(byte)654654;
System.out.println(b1);
long l1 = (byte)654654;
System.out.println(l1);
}
}
