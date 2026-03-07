import java.time.LocalDate;
class localDate{
public static void main(String... args){
LocalDate date = LocalDate.now();
System.out.println("Today date is:-"+date);
LocalDate yesterday = date.minusDays(2);
System.out.println("Yesterday's date:-"+yesterday);
LocalDate tomorrow = date.plusDays(1);
System.out.println("Tomorrow's date:-"+tomorrow);
System.out.println(date.getYear());
System.out.println(date.getMonth());
System.out.println(date.getMonthValue());
System.out.println(date.isLeapYear());
System.out.println(date.getDayOfMonth());
System.out.println(date.plusMonths(2));

LocalDate date1 = LocalDate.of(2024,4,10);
System.out.println(date1.getDayOfWeek());
System.out.println(date1.lengthOfYear());
System.out.println(date1.lengthOfMonth());
System.out.println(date1.getDayOfYear());

String str = "2026-05-24";
LocalDate date2 = LocalDate.parse(str);
System.out.println("Using Parse method:-"+date2);
}

}
