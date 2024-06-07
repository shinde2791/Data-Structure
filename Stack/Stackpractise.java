import java.util.Stack;
public class Stackpractise { 
    public static void main(String[] args) {
        Stack s=new Stack<>();
        Stack s1=new Stack<>();
        s.push(27);
        s.push(34);
        s.push(44);
        s.push(54);
        s.push(67);
        s.push(11);
        s.push(12);


        // System.out.println(s.peek());
        // System.out.println(s.isEmpty());
        // System.out.println(s.size());
       
    //    int mid=s.size()/2+1; 
    //    int count =1;
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        // while(!s.isEmpty()){ // find a middle element of stack
        //    s1.push(s.peek());
        //    s.pop();
        //     }

        // while(!s1.isEmpty()){
        //   System.out.println(s1.peek());
        //   s1.pop();
        // }
           

        int sum=0;

        while(!s.isEmpty()){
            sum=sum+(int)s.pop();
        }
        System.out.println(sum);
        }

    }
    

