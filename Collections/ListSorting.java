import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListSorting {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Volvo");
        ls.add("BMW");
        ls.add("Ford");
        ls.add("Tata");
        
        Collections.sort(ls); // Using Collections.sort(list) (Ascending Order)
        System.out.println(ls);
        Collections.sort(ls, Collections.reverseOrder()); // Using Collections.sort(list, Collections.reverseOrder()) (Descending)
        System.out.println(ls);
        ls.sort(Collections.reverseOrder()); // Using list.sort(Collections.reverseOrder()) (Java 8+) (Descending)
        System.out.println(ls);
    }
}
