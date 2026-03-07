import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        List<String> ar = new ArrayList<>();
        ar.add("Harsh");
        ar.add("Aman");
        ar.add("Kumar");
        ar.add("Raj");
        System.out.println(ar);
        ar.remove("Raj");
        System.out.println(ar);
        System.out.println(ar.contains("Raj"));
        System.out.println(ar.contains("Kumar"));
        System.out.println(ar.size());
        System.out.println(ar.get(1));
        // System.out.println(ar.set(3, "Prem"));

        List<Integer> ai = new ArrayList<>();
        ai.add(76);
        ai.add(86);
        ai.add(245);
        ai.add(46);
        ai.add(387);
        Iterator itr =  ai.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(ai.isEmpty());
        System.out.println(ai.get(3));
        System.out.println(ai.set(4, 14));
        System.out.println(ai);
        ai.clear();
        // ai.removeAll(ai);
        System.out.println(ai);
        ArrayList<String> als = new ArrayList<>();
        als.addAll(ar);
        for(String str:als){
            System.out.println(str);
        }
        List<Character> al3 = new ArrayList<>(4);
        al3.add('A');
        al3.add('B');
        al3.add('C');
        al3.add('D');
        System.out.println(al3);
        Collections.fill(al3,'S');
        System.out.println(al3);
        System.out.println(Collections.frequency(al3, 'S'));
    }
}
