import java.util.*;
import java.text.SimpleDateFormat;
public class nearestSaturdayDate{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String dateStr = scn.nextLine();
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date date = sdf.parse(dateStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            int daysToAdd = Calendar.SATURDAY-dayOfWeek;
            if(daysToAdd<0){
                daysToAdd+=7;
            }
            calendar.add(Calendar.DAY_OF_MONTH, daysToAdd);
            Date nearestSat = calendar.getTime();
            String nearestSatStr = sdf.format(nearestSat);
            System.out.println(nearestSatStr);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            scn.close();
        }
    }
}
