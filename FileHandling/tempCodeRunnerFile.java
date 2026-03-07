package filehandling;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class tempCodeRunnerFile {

    public static void tryCatchWithResourceInput() {

        try (InputStream in = new FileInputStream("input.txt")) {

            int data = in.read();

            while (data != -1) {
                System.out.print((char) data);
                data = in.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        tryCatchWithResourceInput();
    }
}