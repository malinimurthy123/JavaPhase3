package AllAssignments.DailySmallAssignments;

public class MergeSortAlogorithm {

    public static void main(String[] args) {

        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        int[] temp = new int[input.length];  // Temp array to store split results.
        quickSort(input, 0 , input.length-1, temp);

        for(int i =0; i< input.length; i++){
            System.out.println(input[i]);
        }
    }

    private static void quickSort(int[] input, int i, int i1, int[] temp) {
    }

    private static void mergeSort(int[] array, int start, int end, int[] temp){
        /**
         * We only want to split it until the start is less than the end.We don't want to go beyond
         * this point.
         */
        if(start < end) {

            // We need to find a point to split the array.We will find the midpoint.
            int mid = (start + end) / 2;

            /**
             * Now, we will split the array until it is small enough to be sorted (only one element).
             * We will split the array from the starting point till mid and from mid point till the end.
             * Please refer to the picture above to see how the split process works.
             */
            mergeSort(array, start, mid, temp);
            mergeSort(array, mid + 1, end, temp);

            /**
             * Time to sort and split back the given input.
             */
            merge(array,temp,start,end,mid);
        }
    }

    private static void merge(int[] array, int[] temp, int start, int end, int mid){

        /* Copy both side in to our temp array */
        for(int i =start ; i<= end ; i++){
            temp[i] = array[i];
        }
        // let's sort and merge back the array

        int i = start; // start will become left
        int j = mid+1;  // this is the starting point for our where right hand of the array was copied in helper
        int current = start; // position where we like to sort and merge

        /**
         * We will iterate through the temp array.Compare the right and left half , copy the smallest element from the 2 array to
         * the original array/
         */
        while(i <=mid && j <= end){
            if(temp[i] <=temp[j]){
                array[current] = temp[i];
                i++;
            }
            else{
                /**
                 * If right element is smaller than left element.
                 */
                array[current] = temp[j];
                j++;
            }
            /**
             * we increment current position only when we got a match.This can be added to both if and else sections but
             * we will keep it in a common place to avoid code duplication
             */
            current++;
        }

        /**
         * Copy rest of the left side of the array in to the target array
         */
        int remaining= mid -i;
        for (int k = 0 ; k<= remaining; k++){
            array[current+k] = temp[i+k];
        }
    }
}