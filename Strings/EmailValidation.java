public class EmailValidation {

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }
    public static void main(String[] args) {
        String email = "john.doe@gmail.com";
        System.out.println(isValidEmail(email));
    }
}
