package filehandling;
import java.io.FileInputStream;
public class fileInputstreamm {
    public static void main(String[] args) {
        {
            try{
                FileInputStream file = new FileInputStream("C:\\Users\\amank\\OneDrive\\Desktop\\Java\\abc.txt");
                int i=file.read();
                System.out.println(i);
                System.out.println((char)i);
                System.out.println((char)file.read());
                int x=file.available();
                System.out.println(x);
                System.out.println(file.getChannel());
                System.out.println(file.getFD());
                file.close();
            }
            catch(Exception e) {
                System.out.println(e);
                }
        }
    }
}

