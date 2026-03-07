import java.lang.*;
import java.util.*;
public class hashMapp {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Aman");
        map.put(102, "Ram");
        map.put(103, "Shyam");
        map.put(104, "Mahesh");
        map.put(104, "Neha");
        map.put(105, "Raj");
        map.put(106, "Priya");
        map.remove(102);
        System.out.println("Length of HashMap: "+map.size());
        System.out.println("Key exist: "+map.containsKey(102));
        System.out.println("Key exist: "+map.containsKey(101));

        Set<Map.Entry<Integer, String>> st = map.entrySet();
        for(Map.Entry<Integer, String> sh : st){
            System.out.print(sh.getKey()+": ");
            System.out.println(sh.getValue()+".");
        }
    }
}
