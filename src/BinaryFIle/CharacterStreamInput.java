package BinaryFIle;

import java.io.IOException;
import java.io.InputStream;

public class CharacterStreamInput {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        while (true) {
            System.out.println("Enter a character: ");
            char ch = (char) inputStream.read();
            if(ch=='z') {
                System.out.println("Finished");
                break;
            }
            inputStream.skip(2);
            System.out.println("Character input is: " + ch);
        }
    }
}
