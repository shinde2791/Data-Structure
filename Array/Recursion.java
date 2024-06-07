public class Recursion {
    void Printvalue(int i){
        if(i==11){
            return;
        }

        System.out.println(i); 
        Printvalue(i+1);
    }
    public static void main(String[] args) {
        Recursion obj=new Recursion();
        // for(int i=1;i<=10;i++){
        //     obj.Printvalue(i);
        obj.Printvalue(1);
        }
    }
    

