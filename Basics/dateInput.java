import java.text.SimpleDateFormat;
import java.util.*;
class dateInput{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String dateStr = scn.nextLine();
            SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
            try{
            Date date = dateformat.parse(dateStr);
            System.out.println("Input date: "+date);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        scn.close();
    }
}