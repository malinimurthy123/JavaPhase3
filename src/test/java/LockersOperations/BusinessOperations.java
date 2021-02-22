package LockersOperations;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class BusinessOperations implements LockersFileOperations {

    List<String> retrieve = new ArrayList<String>();

    private File files = new File("C:\\lockedme");
    private File filenames[] = files.listFiles();
    Scanner scan = new Scanner(System.in);

    //Method to List ordered List of Files
    @Override
    public void listFiles() {
        List<Path> x;
        try {
            x = Files.list(Paths.get("C:\\lockedme\\")).filter(p -> Files.exists(p))
                    .map(s -> s.getFileName()).sorted().collect(Collectors.toList());
            x.forEach(System.out::println);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //Method to add New Files
    @Override
    public void addNewFile() throws IOException {
        System.out.println("enter file name");
        files = new File("C:\\lockedme\\" + scan.next());
        Scanner enter = new Scanner(System.in);
        System.out.println("\n\nInput content and press enter\n");
        String text = enter.nextLine();

        try {

            PrintWriter writer = new PrintWriter(files);
            writer.write(String.valueOf(text));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

        System.out.println("\nContent written to file " + files);

        try {
            if (files.exists()) {
                System.out.println("file already exists");
            } else {
                files.createNewFile();
                System.out.println("file created");
            }
        } catch (Exception e) {
            System.out.println("file cannot be created");
        }

    }

    //Method to Delete Existing Files
    @Override
    public void deleteExistingFile() {
        // TODO Auto-generated method stub
        System.out.println("Enter the file to delete:");
        Scanner scan = new Scanner(System.in);
        String filename = scan.nextLine();
        File fileObject = new File("C:\\lockedme\\" + filename);

        if (fileObject.delete())
            System.out.println(filename + " has been Deleted Successfully");
        else
            System.out.println("File Not Found in the Locker Folder Location");

    }

    //This is the method to Search for a File
    @Override
    public void searchFile() {
        // TODO Auto-generated method stub
        try {

            Scanner scan = new Scanner(System.in);
            File folderPath = new File("C:\\lockedme\\");
            System.out.println("Enter the file to search:");
            String fileName = scan.nextLine();
            File[] files = folderPath.listFiles();
            int flag = 0;
            try (FileReader fr = new FileReader(folderPath +"\\" +fileName );
                 BufferedReader br = new BufferedReader(fr);
            ) {
                System.out.println("Printing the Data from file....");
                String s = null;
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                    System.out.println("End of Reading File...");
                }
            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            }
        } finally {

        }
    }
}

