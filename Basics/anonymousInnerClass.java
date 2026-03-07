abstract class student{
abstract void detail();
}
class anonymousInnerClass{
public static void main(String... args){
student obj = new student(){ // this is the start of anonymous inner classs
void detail()
{
System.out.println("University LPU");
}
};
obj.detail();
}
}