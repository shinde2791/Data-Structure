// find the middle element
import java.util.Stack;

public class Stackexamplesecond {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int mid=st.size()/2+1;
        int count=1;

        while(!st.isEmpty()){
            if(count==mid){
                System.out.println(st.peek());
                break;
            }
            count++;
            st.pop();
        }
    }
    
}
