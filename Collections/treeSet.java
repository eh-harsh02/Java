import java.util.*;
public class treeSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Aman");
        set.add("Raj");
        set.add("Kumar");
        set.add("Mahesh");
        set.add("Shyam");
        set.add("Mohit");
        set.add("Rohit");
        System.out.println(set);
        set.remove("Raj");
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Data exist: "+set.contains("Rohit"));
        System.out.println("Data exist: "+set.contains("Harsh"));
        System.out.println(set);
        System.out.println(set.isEmpty());
        int i=set.size();
        System.out.println("Length of collection: "+i);
        System.out.println(set.size());
        Set<String> set2 = new TreeSet<>();
        set2 = (TreeSet)set.clone();
        System.out.println(set2);
        set2.clear();
        System.out.println(set2);
        
    }
}
