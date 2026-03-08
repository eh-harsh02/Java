public class ValidatePhone {

    public static boolean isValidPhone(String phone) {
        return phone.matches("[6-9][0-9]{9}");
    }
    public static void main(String[] args) {
        String phone = "9836473657";
        System.out.println(isValidPhone(phone));
    }
}
