interface Student1{
void subject1();
}
interface Student2{
void subject2();
}
class MultipleInhinInterface implements Student1, Student2{
public void subject1(){
System.out.println("Java");
}
public void subject2(){
System.out.println("CPP");
}
public static void main(String... args){
MultipleInhinInterface obj = new MultipleInhinInterface();
obj.subject1();
obj.subject2();
}
}