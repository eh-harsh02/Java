import java.util.*;
public class prac {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String inputStr = scn.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<inputStr.length();i++){
            char ch = inputStr.charAt(i);
            if(isVowel(ch)){
                sb.append('*');
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
        scn.close();
    }

    public static boolean isVowel(Character ch){
        ch = Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    
}
