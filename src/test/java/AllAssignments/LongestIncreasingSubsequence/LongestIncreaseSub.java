package AllAssignments.LongestIncreasingSubsequence;

/*
write a Java code to find the longest increasing subsequence from a list of random numbers.
The code should work properly for n numbers, where n<100.
Malini.Murthy
 */

public class LongestIncreaseSub {


    public static void main(String args[]){
        final int my_arr[] = { 5,10, 22, 9, 33, 21, 50, 41, 60,71, 80, 91, 100,110};
        //int my_arr[] = { 5,10, 22, 9, 33, 21, 50, 41, 60,71, 80, 91, 100,110};
        int arr_len = my_arr.length;
        System.out.println("The length of the longest increasing subsequence is " +  increase_subseq(my_arr, arr_len));
    }
    static int increase_subseq(int my_arr[], int arr_len){
        int seq_arr[] = new int[arr_len];
        int i, j, max = 0;
        for (i = 0; i < arr_len; i++)
            seq_arr[i] = 1;
        for (i = 1; i < arr_len; i++)
            for (j = 0; j < i; j++)
                if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1)
                    seq_arr[i] = seq_arr[j] + 1;
        for (i = 0; i < arr_len; i++)
            if (max < seq_arr[i])
                max = seq_arr[i];
        return max;
    }
 }



