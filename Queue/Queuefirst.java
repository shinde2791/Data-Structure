import java.util.LinkedList;
import java.util.Queue;
public class Queuefirst {
    public static void main(String[] args) {
        Queue<Integer> queue1=new LinkedList<>();

        //enqueue (Add)
        queue1.add(5);
        queue1.add(6);
        queue1.add(7);
        queue1.add(8);
        queue1.add(9);
        queue1.add(10);

        System.out.println(queue1);

        //Dequeue (remove)
         int remove=queue1.remove();
        System.out.println(remove); 

        //check whether the queue is empty

        boolean result=queue1.isEmpty();
        System.out.println(result);
 
        // check the peek element 
        int peekelement=queue1.peek();
        System.out.println(peekelement);

        //check the size 
        System.out.println(queue1.size());

        while(!queue1.isEmpty()){
            System.out.println(queue1.peek());
            queue1.remove();
        }

    }
    
}
