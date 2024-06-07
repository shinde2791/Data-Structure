// write the program to find the middle element of an array 
import java.util.Scanner;

public class Arrayfive {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter the lenght of an array");
        int len=sc.nextInt();
        int arr[] = new int[len];
        int mid = arr.length / 2;
        System.out.println("please enter the element of thr array");

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[mid]) {

                System.out.println("the middle element of an array is " + arr[mid]);
            }
        }
    }

}
