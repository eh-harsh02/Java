public class printDesc {
    void prntDsc(int n){
        if(n==0)
        return;
        System.out.println(n);
        prntDsc(n-1);
        
        
    }
    public static void main(String[] args) {
        printDesc obj = new printDesc();
        obj.prntDsc(5);
    }
    
}
