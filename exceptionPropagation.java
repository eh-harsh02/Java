public class exceptionPropagation {
    void operation(){
        int x[] = new int[5];
        x[2]=100;
    }
    void arrayOperation(){
        operation();
    }
    void arrayIndexOperation(){
        try{
            arrayOperation();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        exceptionPropagation obj = new exceptionPropagation();
        obj.arrayIndexOperation();
        System.out.println("Executed successfully");
    }
}
