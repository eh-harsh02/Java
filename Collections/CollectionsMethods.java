import java.util.*;

public class CollectionsMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(40);
        list.add(30);

        System.out.println("Original List: " + list);


        // 1️⃣ Collections.sort() (Ascending order)
        Collections.sort(list);
        System.out.println("\nSorted List (Ascending): " + list);


        // 2️⃣ Collections.sort(list, Collections.reverseOrder())
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("\nSorted List (Descending using Collections.sort): " + list);


        // 3️⃣ list.sort(Collections.reverseOrder())
        list.sort(Collections.reverseOrder());
        System.out.println("\nSorted List (Descending using list.sort): " + list);


        // 4️⃣ Collections.frequency()
        int freq = Collections.frequency(list, 10);
        System.out.println("\nFrequency of 10: " + freq);


        // 5️⃣ Collections.binarySearch()
        Collections.sort(list); // binarySearch requires sorted list
        int index = Collections.binarySearch(list, 20);
        System.out.println("\nIndex of 20 using binarySearch: " + index);


        // 6️⃣ Collections.min()
        int min = Collections.min(list);
        System.out.println("\nMinimum Element: " + min);


        // 7️⃣ Collections.max()
        int max = Collections.max(list);
        System.out.println("\nMaximum Element: " + max);


        // 8️⃣ Collections.shuffle()
        Collections.shuffle(list);
        System.out.println("\nShuffled List: " + list);


        // 9️⃣ Collections.disjoint()
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);

        boolean result = Collections.disjoint(list, list2);
        System.out.println("\nAre list and list2 disjoint? " + result);
    }
}