package AllAssignments.DailySmallAssignments;

import java.util.PriorityQueue;
import java.util.*;
public class PriorityQueueExample {

        public static void main(String args[]){
            PriorityQueue<String> cities_queue=new PriorityQueue<String>();
            //initialize the PriorityQueue with values
            cities_queue.add("Washington");
            cities_queue.add("NYC");
            cities_queue.add("New York");
            cities_queue.add("California");
            cities_queue.add("Seattle");
            //print the head of the PriorityQueue
            System.out.println("PriorityQueue Head:"+cities_queue.element());

            System.out.println("\nPriorityQueue contents:");
            Iterator iter=cities_queue.iterator();
            while(iter.hasNext()){
                System.out.print(iter.next() + " ");
            }
        }
    }
