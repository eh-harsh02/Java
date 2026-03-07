import java.util.*;
import java.lang.*;
class comparatorinterface comparatorInterface Comparator<String>{
    public int compare(String s1, String s2){
        return s1.compareTo(s2);
    }
}
public class comparatorInterface {
    public static void main(String[] args) {
        TreeSet<String> obj = new TreeSet<>();
        obj.add("B");
        obj.add("a");
        obj.add("C");
        obj.add("h");
        obj.add("I");
        obj.add("Z");
        System.out.println("TreeSet comparison: "+obj);
    }
}

