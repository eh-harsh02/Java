public class sumOfDigit {
    public static int sumD(int n){
        if (n==0){
            return 0;
        }
        return sumD(n/10)+(n%10);
    }
    public static void main(String[] args) {
        System.out.println(sumD(4878478));
    }
}

