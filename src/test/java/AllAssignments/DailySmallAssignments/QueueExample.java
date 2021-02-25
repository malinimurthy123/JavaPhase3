package AllAssignments.DailySmallAssignments;
import java.util.*;

public class QueueExample {

    public static void main(String[] args) {

        /*
         * We cannot create instance of a Queue as it is an
         * interface, we can create instance of LinkedList or
         * PriorityQueue and assign it to Queue
         */
        Queue<String> q = new LinkedList<String>();

        //Adding elements to the Queue
        q.add("Malini");
        q.add("Shalini");
        q.add("Natalia");
        q.add("Vinay");
        q.add("AnanthaKrishna");

        System.out.println("Elements in Queue:"+q);
        System.out.println("Removed element: "+q.remove());
        System.out.println("Head: "+q.element());
        System.out.println("poll(): "+q.poll());
        System.out.println("peek(): "+q.peek());
        //Again displaying the elements of Queue
        System.out.println("Elements in Queue:"+q);
    }
}