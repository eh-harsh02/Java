class finalKeyword{
static final String color = "Black";
static void change()
{
color="Red";
System.out.println(color);
}
public static void main(String... args){
finalKeyword.change();
}
}
/* finalKeyword.java:5: error: cannot assign a value to final variable color
color="Red";
^
1 error
*/