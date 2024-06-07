import java.util.PriorityQueue;
import java.util.Comparator;
public class PriorityQueueexample {
    public static void main(String[] args) {
        PriorityQueue<Integer> p1=new PriorityQueue<>(Comparator.reverseOrder());
        p1.add(10);
        p1.add(30);
        p1.add(20);
        p1.add(4);

        System.out.println("priority queue are "+ p1);
    }
    
}
