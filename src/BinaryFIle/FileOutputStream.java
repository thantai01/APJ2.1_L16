package BinaryFIle;


import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new java.io.FileOutputStream(
                    "C:\\Users\\84936\\Desktop\\New folder\\Destination\\writer.txt");
        byte[] bytes = new byte[]{'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            outputStream.write(b);
        }
        System.out.println("Writing Finished");
        outputStream.close();
    }
}

