import java.util.*;
import java.io.*;
class tryCatchWithResourceInput{
    static void Divide() throws Exception{
        try(FileInputStream fi = new FileInputStream("C:\\Users\\amank\\OneDrive\\Desktop\\Java\\resourceInput.txt");
        Scanner scn = new Scanner(fi);
        ){
            int a=scn.nextInt();
            int b=scn.nextInt();
            System.out.println(a/b);
        }
    }
    public static void main(String[] args) {
        try{
            Divide();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}