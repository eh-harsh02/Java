
import java.util.regex.Pattern;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Hello Java World";
        String str2 = "hello java world";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. substring()
        System.out.println("Substring(0,5): " + str.substring(0,5));

        // 4. indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // 5. lastIndexOf()
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // 6. equals()
        System.out.println("Equals: " + str.equals(str2));

        // 7. equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str2));

        // 8. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 9. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 10. replace()
        System.out.println("Replace Java with Python: " + str.replace("Java","Python"));

        // 11. contains()
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 12. split()
        String sentence = "Apple,Banana,Mango";
        String[] fruits = sentence.split(",");

        System.out.println("Split result:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        // Split using Pattern.quote()
        String ip = "192.68.1.1";
        String[] part = ip.split(Pattern.quote("."));
        

        // 13. toCharArray()
        char[] arr = str.toCharArray();
        System.out.println("Characters:");
        for(char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 14. String.valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("Number to String: " + numStr);

        // 15. Integer.parseInt()
        String number = "200";
        int parsed = Integer.parseInt(number);
        System.out.println("String to Integer: " + parsed);



        // ---------------- StringBuilder Methods ----------------

        StringBuilder sb = new StringBuilder("Java");

        // append()
        sb.append(" Programming");
        System.out.println("Append: " + sb);

        // insert()
        sb.insert(4," Language");
        System.out.println("Insert: " + sb);

        // delete()
        sb.delete(4,13);
        System.out.println("Delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // length()
        System.out.println("Length: " + sb.length());
    }
}