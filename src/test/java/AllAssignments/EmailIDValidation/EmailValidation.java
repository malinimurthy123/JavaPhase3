package AllAssignments.EmailIDValidation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
You have an array of email IDs of employees. As a programmer, write a program to search the email ID entered by a user.
 */

public class EmailValidation {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("malini.kr@gmail.com", "malini.murthy@gmail.com", "balaji@gmail.com");

        System.out.println("Enter the email ID to be searched");
        Scanner sc = new Scanner(System.in);
        String emailID = sc.nextLine();

        boolean match = list.stream().anyMatch(s -> emailID.contains(s));
        if (match)

            System.out.println( emailID + ": Exists :" + match );
        else
            System.out.println(emailID + ": Does Not Exist : " + match);

    }
}

