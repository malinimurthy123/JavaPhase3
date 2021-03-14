package Phase2.JDBCMenuOptionsAssignment;

import Phase2.App;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuOptionsMain {
    private static int option;


    

    public static void main( String[] args ) throws SQLException {

        System.out.println("Menu to JBCD Operations Application: \n");
        System.out.println("Please enter the Menu Options....");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice of action: \n");
        System.out.println("\t1. Enter New Learner Details, enter name and address \n");
        System.out.println("\t2. Display All Learners with their details \n");
        System.out.println("\t3. Search for a Learner by Name / Address \n");
        System.out.println("\t4. Update Learners with their details by entering their ID \n");
        System.out.println("\t5. Delete Learner by entering ID \n");
        System.out.println("\t6. What do you want to sory by? \n");
        System.out.println("\t 7. Exit JDBC Operations Application \n");
        option = sc.nextInt();

        while (option != 7) {
            switch (option) {
                case 1:
                    break;
                        //exit();
                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:

                    System.out.println("\t6. What do you want to sory by? \n");

                    System.out.println("\tA.First Name \n");
                    System.out.println("\tB. Last Name \n");
                    System.out.println("\tC. Address? \n");
                    System.out.println("\tD. ID? \n");


                    break;

                case 7:
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;

            }

        }

    }
}
