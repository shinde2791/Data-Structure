import java.util.Scanner;

public class arraytwo {
    //write a program to search a element in the array
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("please enter the element of array");
        for(int i=0;i<arr.length;i++){
           
            arr[i]=sc.nextInt();
        }
        System.out.println("please enter the value you wants to search");
        int search=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                System.out.println("element found at " + i +" index");
                break;
            }
        }
        
    }
    
}
