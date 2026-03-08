import java.util.HashMap;
import java.util.Map;
public class WordFreqCounter {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String words[] = {"apple","banana","apple","orange","banana"};
        for(String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                String s = entry.getKey();
                char upper = Character.toUpperCase(s.charAt(0));
                String res = s.replace(s.charAt(0), upper);

                System.out.println(entry.getKey().toUpperCase());
                System.out.println(res);
            }
        }
        System.out.println(map);
    }
}
