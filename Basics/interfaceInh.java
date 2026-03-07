interface interfaceInh{
void rollNoDetail();
}
interface interfaceInh extends rollNo{
void nameDetail();
}
interface interfaceInh extends name{
void detail();
}
class interfaceInh implements studentDetail{
public void rollNoDetail(){
System.out.println("Roll no: 1");
}
public void nameDetail(){
System.out.println("Name: Aman");
}
public void detail(){
System.out.println("Details of student: ");
}
public static void main(String... args){
interfaceInh obj = new interfaceInh();
obj.rollNoDetail();
obj.nameDetail();
obj.detail();
}
}
