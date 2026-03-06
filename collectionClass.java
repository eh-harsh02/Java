import java.util.*;
class collectionClass{
public static void main(String... args){
ArrayList<String> arr = new ArrayList<String>();
arr.add("Aman");
arr.add("Shayam");
arr.add("Ram");
arr.add("Kumar");
arr.forEach(n->System.out.println(n));
}
}