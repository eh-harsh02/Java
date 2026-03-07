public class userDefinedException {
    static void marks(int mar){
        if(mar<=60)
            throw new ArithmeticException("Minimum marks");
            else{
                System.out.println("Fulfilled the basic criteria");
            }
        }
    
    public static void main(String[] args) {
       try{
        marks(70);
        marks(30);
       } 
       finally{
        System.out.println("Code will execute properly");
       }
    }
}

