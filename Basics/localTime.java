import java.time.*;
import java.time.LocalTime;
class localTime{
public static void main(String... args){
LocalTime time1 = LocalTime.of(10,50,25);
System.out.println(time1);
LocalTime time2  = LocalTime.now();
System.out.println(time2);
System.out.println(time2.getHour());
System.out.println(time2.getMinute());
System.out.println(time2.getSecond());
System.out.println(time2.getNano());

LocalTime time3 = time2.minusHours(2);
System.out.println(time3);
LocalTime time4 = time2.minusMinutes(23);
System.out.println(time4);
System.out.println(time1.plusHours(2));
System.out.println(time1.plusMinutes(12));

ZoneId zone = ZoneId.of("Asia/Kolkata");
LocalTime locTime = LocalTime.now(zone);
System.out.println(locTime);
}
}
