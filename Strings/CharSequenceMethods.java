public class CharSequenceMethods {

    public static void main(String[] args) {

        CharSequence cs = "HelloJava";

        // 1. length()
        System.out.println("Length: " + cs.length());

        // 2. charAt()
        System.out.println("Character at index 4: " + cs.charAt(4));

        // 3. subSequence()
        CharSequence sub = cs.subSequence(0,5);
        System.out.println("Subsequence (0,5): " + sub);

        // 4. toString()
        String str = cs.toString();
        System.out.println("Converted to String: " + str);
    }
}