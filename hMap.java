import java.util.HashMap;
public class hMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("abc", 35);
        map.put("bc", 95);
        for(String rec:map.keySet()){
            System.out.println(rec+"->"+map.get(rec));
        }
    }
}
