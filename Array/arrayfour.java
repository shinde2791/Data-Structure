import java.util.Scanner;
// write a program to find even element in array 
public class arrayfour {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int length=sc.nextInt();
       int [] arr=new int[length]; 
       
       for(int i=0;i<arr.length;i++){
          arr[i]=sc.nextInt();
       }
       for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
            System.out.println(arr[i]+" is even element");
        }
       }
    }
    
}
