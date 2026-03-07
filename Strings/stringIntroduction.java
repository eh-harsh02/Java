import java.util.*;

public class stringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        sc.close();
        int lengthA = A.length();
        int lengthB = B.length();
        int sumLength = lengthA+lengthB;
        String lexicographicallyGreater = isLexicographicallyGreater(A, B) ? "Yes" : "No";
        
        String capitalizedA = capitalizeFirstLetter(A);
        String capitalizedB = capitalizeFirstLetter(B);
        
        System.out.println(sumLength);
        System.out.println(lexicographicallyGreater);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
    
    public static boolean isLexicographicallyGreater(String str1, String str2){
        int minLength = Math.min(str1.length(), str2.length());
        
        for(int i=0;i<minLength;i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            if(ch1 != ch2){
                return ch1>ch2;
            }
        }
        return str1.length() > str2.length();
    }
    
    public static String capitalizeFirstLetter(String str){
        if(str==null||str.isEmpty()){
            return str;
        }
        return Character.toUpperCase(str.charAt(0))+str.substring(1).toLowerCase();
    }
}

