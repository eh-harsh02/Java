public class generic {
    public static <E> void printElement(E[] data){
        for(E values:data){
            System.out.println(values);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String name[] = {"Ram", "Shyam", "Yash", "Aman"};
        Integer num[] = {3,98, 98, 13,45,76,45};
        Character ch[] = {'H', 'A', 'R', 'S', 'H'};
        Float farr[] = {98.9f, 34.5f, 34.7f, 21.6f};
        printElement(name);
        printElement(num);
        printElement(ch);
        printElement(farr);
    }
}

