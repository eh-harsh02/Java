package filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class fileInputOutputStream {
    public static void main(String[] args) {
        String s = "Hello K22BK Students";
        int arr[] = {4,45,78,98,3,87};
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\amank\\OneDrive\\Desktop\\Java\\object.doc");
            ObjectOutputStream obj = new ObjectOutputStream(fout);
            obj.writeObject(s);
            obj.writeObject(arr);
            for(int x:arr){
                obj.writeInt(x);
            }
            obj.flush();  // flush()---> transfer the data to created file(object.doc)
            ObjectInputStream objin = new ObjectInputStream(new FileInputStream("C:\\Users\\amank\\OneDrive\\Desktop\\Java\\object.doc"));
            System.out.println((String)objin.readObject());
            int i = objin.available();
            System.out.println("Available bytes:- "+i);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
