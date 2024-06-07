import java.util.Scanner;

public class Array {
//write a progarm to create array taking input from user
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("please enter the element of array");
        for(int i=0;i<arr.length;i++){
           
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    
    }
    
}

