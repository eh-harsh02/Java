public class ValidateMAC {

    public static boolean isValidMAC(String mac) {

        String[] parts = mac.split(":"); // mac.split(Pattern.quote(":")) this is also correct 
        if(parts.length != 6) return false;
        for(String part : parts) {
            if(!part.matches("[0-9A-Fa-f]{2}")) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String mac = "00:1A:2B:3C:4D:5E";
        System.out.println(isValidMAC(mac));
    }
}
