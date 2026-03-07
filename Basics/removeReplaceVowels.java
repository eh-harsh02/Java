public class removeReplaceVowels {
    public static void main(String[] args) {
        String inputString = "Hello World";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (isVowel(currentChar)) {
                sb.append('*');
            } else {
                sb.append(currentChar);
            }
        }

        System.out.println("Original String: " + inputString);
        System.out.println("String with vowels replaced: " + sb.toString());
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
