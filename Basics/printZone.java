import java.time.*;
class printZone{
public static void main(String... args){
LocalDateTime locDateTime = LocalDateTime.of(2024,Month.MARCH,29,16,52);
ZonedDateTime zone = ZonedDateTime.now();
System.out.println(zone.getZone());
}
}
