package JavaIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        File newFile = new File("C:\\Users\\84936\\Desktop\\New folder\\Test.txt");

        DemoFile.CreateFile(newFile);
        DemoFile.WriteToFile(newFile);
        DemoFile.GetFileInformation(newFile);

//        DemoFile.DeleteFile(newFile);
//        DemoFile.getDirectoryPath();


    }
    static void CreateFile(File newFile){
        try {
            if(newFile.createNewFile()) {
                System.out.println("File created" + newFile.getName());
            } else {
                System.out.println("File already exist.");
            }
        } catch (IOException e) {
            System.out.println("An error occupied");
            e.printStackTrace();
        }
    }

    static void GetFileInformation(File newFile) {
        if(newFile.exists()) {
            System.out.println("FileName: " + newFile.getName());
            System.out.println("Absolute path: " + newFile.getAbsolutePath());
            System.out.println("Writeable: " + newFile.canWrite());
            System.out.println("Readable: " + newFile.canRead());
            System.out.println("File size (byte): " + newFile.length());
            long lastModifiedInMillis = newFile.lastModified();
            Date dateModify = new Date(lastModifiedInMillis);
            System.out.println("Last time modify: " + dateModify);
        }
        else {
            System.out.println("File does not exists.");
        }
    }

    static void DeleteFile(File newFile) {
        if(newFile.delete()) {
            System.out.println(newFile.getName() + " is delete");
        } else {
            System.out.println("Delete operation is failed");
        }
    }

    static void WriteToFile(File newFile) throws IOException {
        BufferedWriter writeTo = new BufferedWriter(new FileWriter(newFile));
        writeTo.write("Hello word");
        writeTo.close();
        System.out.println("Content had been written");
    }

    static void getDirectoryPath() {
        String workingDir = System.getProperty("user.dir");
        System.out.println("Current working directory: " + workingDir);
    }


}
