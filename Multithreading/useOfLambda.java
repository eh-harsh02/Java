import java.util.*;
import java.util.Collections;

class useOfLambda{
int medId;
String medName;
float medPrice;
public medicine(int medId, String medName, float medPrice){
this.medId=medId;
this.medName=medName;
this.medPrice=medPrice;
}
}
class useOfLambda{
public static void main(String... args){
ArrayList<medicine> list=new ArrayList<medicine>();
list.add(new medicine(1, "Dolo", 60f));
list.add(new medicine(2, "Grillincutes", 300f));
list.add(new medicine(3, "Paracitamol", 80f));
list.add(new medicine(4, "Ezythromycin", 50f));
list.add(new medicine(5, "Glimpride", 250f));
System.out.println("------Sorting medicine with name--------");
Collections.sort(list,(m1,m2)->{
return m1.medName.compareTo(m2.medName);
});
for(medicine m:list){
System.out.println(m.medId+" "+m.medName+" "+m.medPrice);
}
}
}
