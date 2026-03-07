package filehandling;
import java.io.FileOutputStream;
public class fileOutputstreamm {
    public static void main(String[] args) {
        try{
        FileOutputStream fout = new FileOutputStream("C:\\Users\\amank\\OneDrive\\Desktop\\Java\\testFile.doc");
        fout.write(65);
        fout.write(67);
        String s = "CSE 310 Pragramming in Java";
        byte b[] = s.getBytes();
        fout.write(b);
        fout.close();

        FileOutputStream fout1 = new FileOutputStream("C:\\Users\\amank\\OneDrive\\Desktop\\Java\\testFile.txt");
        fout1.write(78);
        fout1.write(75);
        String s1 = "CSE 406 Advance in Java";
        byte b1[] = s1.getBytes();
        fout1.write(b1);
        fout1.close();


    }

    catch(Exception e){
        System.out.println(e);
    }
}
}

