public class arraynon {
    public static void main(String[] args) {
        int arr [] ={1,3,2,1,3,4};
        int n=arr.length;

        for(int i=0;i<n;i++){
          int  count=0;
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }

            }
            if(count==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
    
}
