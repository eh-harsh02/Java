interface demoabs{
void student();
void faculty();
void clerk();
void officer();
}
abstract class demoabs implements newint{
public void student(){
System.out.println("Student");
}
}
class demoabs extends demo{
public void faculty(){
System.out.println("Faculty");
}
public void clerk(){
System.out.println("Clerk");
}
public void officer(){
System.out.println("Officer");
}
public static void main(String... args){
demo d = new demoabs();
d.student();
d.faculty();
d.clerk();
d.officer();
}
}
