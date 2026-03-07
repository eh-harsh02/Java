public class reverseStr {
    public static void main(String[] args) {

        // using string manipulation
        String input = "programming";
        String revStr = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            revStr += input.charAt(i);
        }
        System.out.println(revStr);

        
        StringBuilder sb = new StringBuilder("Aman");
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() -1 -i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}

