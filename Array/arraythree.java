import java.util.Scanner;
public class arraythree {
    //write a program to find sum of all the elements in array 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the length of array");
        int length=sc.nextInt();
        int [] arr=new int[length];
        System.out.println("please enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("the sum of all the elements is " + sum); 
        int x=arr.length/2;
        System.out.println(arr[x]);
    }
    
}
