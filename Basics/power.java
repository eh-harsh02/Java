public class power {

    public static long powr(long a, long b){
        if(b==0){
            return 1;
        }
        return powr(a, b-1) *a;
    }
    public static void main(String[] args) {
        long a = 3;
        long b = 10;
        long res = powr(a,b);
        System.out.println(res);
        
    }
}
