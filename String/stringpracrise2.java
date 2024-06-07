import java.util.*;
public class stringpracrise2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        // write a program to check string is palimdrom or not
        String name=sc.nextLine();
        int len=name.length();
        String recname="";

        for(int i=len-1;i>=0;i--){
          recname=recname+name.charAt(i);

        }

        //System.out.println(recname.equals(name));
        if(recname.equals(name)){
            System.out.println("its a palindrom");
        }else{
            System.out.println("not a palindrome");
        }

    }
    
}
