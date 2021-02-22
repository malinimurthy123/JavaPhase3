package LockersOperations;

import java.io.IOException;

public interface LockersFileOperations {
    void addNewFile() throws IOException;
    void listFiles();
    void deleteExistingFile();
    void searchFile();
}
