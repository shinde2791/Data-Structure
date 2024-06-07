import java.util.Stack;
public class arraysort {

    public static Stack sortstack(Stack input){
        Stack tempStack=new Stack<>();
        while(!input.isEmpty()){
            int tmp=(int)input.pop();
            while(!tempStack.isEmpty() && (int)tempStack.peek()>tmp){
                input.push(tempStack.pop());
            }
            tempStack.push(tmp); 
        }
        
        return tempStack;
    }
    public static void main(String[] args) {
        Stack input=new Stack<>();
        input.push(34);
        input.push(44);
        input.push(31);
        input.push(98);
        input.push(92);
        input.push(23);

        Stack tmpStack=sortstack(input);
        while(!tmpStack.isEmpty()){
            System.out.println(tmpStack.pop()+" ");
        }
    }
    
}
