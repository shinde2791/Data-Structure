import java.util.Stack;
public class Stackexample {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.size());

        while(!st.empty()){
            System.out.println(st.peek());
            st.pop();  
        }
    }
    
}
