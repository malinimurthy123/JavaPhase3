package AllAssignments.EmailIDValidation;

import java.util.Scanner;

/*
You have an array of email IDs of employees. As a programmer, write a program to search the email ID entered by a user.
 */

public class EmailValidation {

    public static void main(String[] args) {

        String[] strArray = { "malini.kr@gmail.com", "malini.murthy@gmail.com", "balaji@gmail.com" };

        System.out.println("Enter the email ID to be searched");
        Scanner sc = new Scanner(System.in);
        String emailID = sc.nextLine();

        boolean found = false;
        int index = 0;

        for (int i = 0; i < strArray.length; i++) {
            if(emailID.equals(strArray[i])) {
                index = i; found = true; break;
            }
        }
        if(found)
            System.out.println(emailID +" found at the index "+index);
        else
            System.out.println(emailID +" not found in the array");
    }
}

