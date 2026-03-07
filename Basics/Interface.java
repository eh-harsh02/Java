interface employee
{
void detail();// public abstract
}

class Interface implements employee{
public void detail(){
System.out.println("I belongs to interface");
}
public static void main(String... args){
Interface obj = new Interface();
obj.detail();
}
}