public class arraymissing {
    public static void main(String[] args) {
        int [] arr={2,4,8,10};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            if(arr[i+1]-arr[i] !=2){
                System.out.println(arr[i]+2); 
            }
        }

      
        }

    }
    

