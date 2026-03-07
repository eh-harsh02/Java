import java.util.regex.Pattern;
public class ValidateIp {
    
    public static boolean isValidIP(String ip) {
        String[] parts = ip.split(Pattern.quote(".")); // ip.split("\\.") -> this is also correct
        if(parts.length != 4) {
            return false;
        }

        for(String elt : parts) {
            if(elt.length() == 0 || elt.length() > 3) {
                return false;
            }

            for(char ch : elt.toCharArray()) {
                if(!Character.isDigit(ch)) return false;
            }
            int num = Integer.parseInt(elt);
            if(num < 0 || num > 255) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String ip = "192.168.1.1";
        System.out.println(isValidIP(ip));
    }
}
