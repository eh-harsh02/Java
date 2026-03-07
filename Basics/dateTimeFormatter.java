import java.time.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class dateTimeFormatter{
public static void main(String... args){
LocalDateTime now = LocalDateTime.now();
System.out.println("Before formatting:-"+now);
System.out.println(now.plusDays(100));
System.out.println(now.minusDays(50));
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy mm-HH-ss");
String formatedDate = now.format(formatter);
System.out.println("After formatting:-"+formatedDate);
}
}
