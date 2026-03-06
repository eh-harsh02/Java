import java.util.Scanner;
public class nestedTryBlock {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,c=0;
        try{
            try{
                System.out.print("First Number:- ");
                a=scn.nextInt();
                System.out.print("Second Number:- ");
                b=scn.nextInt();
                c=a/b;
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
            finally{
                System.out.println("Division result:- "+c);
            }
            try{
                int x[] = new int[4];
                x[6]=10;
            }catch(ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }
            try{
                String str = null;
                int t=Integer.parseInt(str);
            }catch(NumberFormatException e){
                System.out.println(e.toString());
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Normal Flow");
        }
    }
}
