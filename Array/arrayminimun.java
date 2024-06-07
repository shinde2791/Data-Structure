//Write a program to find a minimum element in array
import java.util.Scanner;
public class arrayminimun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("declare the lenght of array");
        int len=sc.nextInt();
        int [] arr=new int[len];
        System.out.println("Enter the element of an array") ;
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int j=1;j<len;j++){
            if(arr[j]<arr[0]){
                min=arr[j];
            }
        }

        System.out.println("the minimum value of element" + min);
    }
    
}
