import java.util.*;
class generic_Sum{
    static Double add(ArrayList<? extends Number> num){
        double sum=0.0;
        for(Number n:num){
            sum=sum+n.doubleValue();
        }
        return sum;
    }
    public static void main(String... args){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(5);
        ar.add(15);
        System.out.println(add(ar));
        ArrayList<Double> ar1 = new ArrayList<Double>();
        ar1.add(5.87);
        ar1.add(15.65);
        System.out.println(add(ar1));
    }
}