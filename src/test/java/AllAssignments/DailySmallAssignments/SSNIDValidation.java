package AllAssignments.DailySmallAssignments;
import java.util.regex.*;


// Java Code to validate SSN (Social Security Number) with regex
//Author: Malini.Murthy

public class SSNIDValidation {

    public static void main(String args[])
    {
        String str1 = "123-45-6789";
        System.out.println(isValidSSN(str1));

    }
    public static boolean isValidSSN(String str)
    {
        // Regex pattern
        String regex = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";

        Pattern p = Pattern.compile(regex);

        if (str == null)
        {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }

}
