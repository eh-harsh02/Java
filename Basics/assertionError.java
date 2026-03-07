import java.util.Scanner;

public class assertionError {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = scn.nextInt();
        System.out.print("Enter name: ");
        String name = scn.nextLine();
        System.out.println("Id of student: "+id);
        System.out.println("Name of students: "+name);
        System.out.print("Enter marks: ");
        int marks = scn.nextInt();
        assert marks>=60:"Fail, you cannot register";
        System.out.println("Marks of user: "+marks);
    }
}

