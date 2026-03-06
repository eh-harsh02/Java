import java.util.Scanner;
class exceptionHandling {
public static void main(String... args){
int c=0;
Scanner scn = new Scanner(System.in);
try{
System.out.print("Enter first number: ");
int a = scn.nextInt();
System.out.print("Enter second number: ");
int b = scn.nextInt();
c=a/b;
}
catch(Exception e){
System.out.println(e);
}
finally{
System.out.println("Division result is: "+c);
System.out.println("Block will execute in any situation");
}
scn.close();
}
}