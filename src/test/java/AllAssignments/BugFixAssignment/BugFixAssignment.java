package AllAssignments.BugFixAssignment;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


/*
Malini.Murthy
As a developer, fix the bugs in the application using the appropriate algorithmic techniques.
The source code should be pushed to your GitHub repositories. You need to document the steps and write the algorithms in the Google Docs.
The link of your GitHub repository is must. In order to track your task, you need to share the link of the repository. You can add a section in the Google Docs.
Document the step-by-step process involved in completing this task.
 */

public class BugFixAssignment {

    public static void main(String[] args) {
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        int[] arr1 = {1,2,3,4,5,6};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        expenses.addAll(arrlist);
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1;j<=slen;j++){
            if(options==j){
                switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        expenses.addAll(arrlist);
                        System.out.println(expenses+"\n");
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice==options){
                            expenses.clear();
                            System.out.println(expenses+"\n");
                            System.out.println("All your expenses are erased!\n");
                        } else {
                            System.out.println("Oops... try again!");
                        }
                        optionsSelection();
                        break;
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection();
                        break;
                    case 5:
                        searchExpenses(expenses, sc);
                        optionsSelection();
                        break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }
    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
    }
    /*Original Code that needs Bug Fix
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        System.out.println("Enter the expense you need to search:\t");
        //Complete the method

    }*/

    /*
    Code that has the bug fix for method searchExpenses
    Malini.Murthy
     */

    private static void searchExpenses(List<Integer> arrayList, Scanner inputAccept) {
        System.out.println("Enter the expense you need to search:\t");

        int key = -1;
        try {
            key = inputAccept.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\n");
            return;
        }

        System.out.println(arrayList);

        // Searching the input value in the List using Key value pair

        int index = arrayList.indexOf(key);

        if (index < 0)
            System.out.println(key + " is not present in the list!");
        else
            System.out.println("Value " + "[ " + key + " ]" + " has been found at index: " + index);
    }


/* Old code that needs bug fix and method implementation
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
        //Complete the method. The expenses should be sorted in ascending order.
    }

 */

    /*
    Code that has the bug fix for method sortExpenses
    Malini.Murthy
     */
    private static void sortExpenses(List<Integer> arrayList) {
        Collections.sort(arrayList);
        System.out.println("\n" + arrayList);
    }


}
