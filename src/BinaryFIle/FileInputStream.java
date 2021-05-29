package BinaryFIle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new java.io.FileInputStream(
                "C:\\Users\\84936\\Desktop\\New folder\\From\\reader.txt");
        int i = -1;
        while ((i = inputStream.read()) != -1) {
            System.out.print((char) i);
        }
        inputStream.close();
    }
}