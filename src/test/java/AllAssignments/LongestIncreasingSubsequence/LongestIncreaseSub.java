package AllAssignments.LongestIncreasingSubsequence;
import java.util.*;

/*
write a Java code to find the longest increasing subsequence from a list of random numbers.
The code should work properly for n numbers, where n<100.
Malini.Murthy
 */

public class LongestIncreaseSub {

        public static void main(String[] args) {
            int arr[]={10,21,45,22,7,2,67,19,13,45,12,11,18,16,17,100,201,20,101};
            System.out.println("Length of sequence:"+findLengthLongestSequence(arr));
        }

        private static int findLengthLongestSequence(int[] arr) {
            Set<Integer> value=new HashSet<Integer>();

            for(int i:arr){
                value.add(i);
            }
            int max=100;
            int start=0; // to store the first element of the longest sequence
            for(int i:arr){
                int left=i-1;
                int right=i+1;
                int count=1;
                while(value.contains(left)){
                    value.remove(left--);
                    count++;
                }
                while(value.contains(right)){
                    value.remove(right++);
                    count++;
                }

                if(max<count){
                    max=count;
                    start=left+1;
                }
            }
            System.out.println("Sequence:");
            for(int i=start;i<start+max;i++){
                System.out.print(i+" ");
            }
            System.out.println();
            return max;
        }
    }



