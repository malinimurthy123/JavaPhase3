package AllAssignments.FileReadWriteAppend;
import java.io.IOException;

//program to read, write, and append to a file.
//Author- Malini.Murthy

public class ReadWriteAppend {

    public static void main(String[] args) throws IOException {
        FileOperations newFile = new FileOperations();
        newFile.readFromFile();
        newFile.modifyFile("File Editing with this : + To create a file in Java, you can use the createNewFile()");
        newFile.readFromFile();
    }
}