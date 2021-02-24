package Lockers;

import LockersOperations.BusinessOperations;

import java.io.*;
import java.util.*;

/*
Author: Malini.Murthy
Date : 2/10/2021
LockedMe Application is a Command Line Application that has several features like
File Sorting as a list , Adding files, Deleting Files, Search a File and Display its contents
 */

public class LockedMe {

    public static void main(String[] args) throws IOException {
        userLockedMeScreen();
        try {
            userOptions();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.err);
        }
    }

    public static void userLockedMeScreen() {
        System.out.println("Application Name : LOCKEDME.COM \n");
        System.out.println("Developer        : Malini.Murthy \n");
    }

    public static void userOptions() throws IOException {
        @SuppressWarnings("resource")

        BusinessOperations bOperation    = new BusinessOperations() ;
        Scanner sc = new Scanner(System.in);

        int option;
        System.out.println("Menu to LockedMeApplication: \n");
        do {
            System.out.println("Enter your choice of action: \n");
            System.out.println("\t1. List all LockedMe Files in an Ascending order \n");
            System.out.println("\t2. LockedMe Business-level operations \n");
            System.out.println("\t3. Exit LockedMe Application \n");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    bOperation.listFiles();
                    break;
                case 2:
                    int caseOption;
                    do {
                        System.out.println("Enter your choice to Perform LockedMe Business-level operations");
                        System.out.println("\t1. Add a File and its content to the LockedMe Application");
                        System.out.println("\t2. Delete a file from the LockedMe Application");
                        System.out.println("\t3. Search a file and show its Content");
                        System.out.println("\t4. Exit to LockedMe Main Menu");

                        caseOption = sc.nextInt();
                        switch (caseOption) {
                            case 1:
                                bOperation.addNewFile();
                                break;
                            case 2:
                                bOperation.deleteExistingFile();
                                break;
                            case 3:
                                bOperation.searchFile();
                                break;
                            case 4:
                                System.out.println("Exit Menu : Business Level operations...");
                                System.out.println("---------------------------------\n");
                                break;
                            default:
                                System.out.println("Invalid Choice");
                                break;
                        }
                    } while (caseOption != 4);
                    break;
                case 3:
                    System.out.println("Exiting from the app...");
                    break;
                default:
                    System.out.println("Invalid Option");
            }

        } while (option != 3);

    }
}