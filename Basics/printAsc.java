public class printAsc {
    void prntAsc(int n){
        if(n==0)
        return;
        prntAsc(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        printAsc obj = new printAsc();
        obj.prntAsc(5);
    }
}

