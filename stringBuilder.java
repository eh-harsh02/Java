import java.util.*;
public class stringBuilder {
    public static void main(String[] args) {
        // String str = "Aman";
        // StringBuilder sb = new StringBuilder("Aman");
        // System.out.println(sb); // Aman
        // character At index 0
        // System.out.println(sb.charAt(0)); // A
        // Set char at index 0
        // sb.setCharAt(0, 'H');
        // System.out.println(sb); // Hman
        // sb.insert(3,'n');
        // System.out.println(sb);
        // delete the extra n
        // sb.delete(3,4);
        // System.out.println(sb);
        // append
        String str="Hello world!";
        StringBuilder sb = new StringBuilder(str);
        // sb.append("m");
        // sb.append("a");
        // sb.append("n");
        // System.out.println(sb); // Aman
        String substring = sb.substring(6, 12);
        System.out.println(substring);

    }
}
