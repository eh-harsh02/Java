public class multipleCatchBlock {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println((s.toUpperCase()));
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
        catch(NumberFormatException e){
            System.out.println(e.toString());
        }
        finally{
            System.out.println("Particular cath block will execute");
        }

    }
    
}
