class arrayCopyDemo {
public static void main(String[] args) {

char[] source = { 'a', 'b', 'c', 'd', 'e', 'g', 'h',
'i', 'j', 'k', 'l', 'm' };
//declaring a destination array
char[] destination = new char[7];

//copying array using System.arraycopy() method
System.arraycopy(source, 2, destination, 0, 5);
//printing the destination array
System.out.println(String.valueOf(destination));

}
}
