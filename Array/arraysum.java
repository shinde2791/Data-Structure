public class arraysum {
    public static void main(String[] args) {
        int [] arr={1,10,2,20,3};
        int n=arr.length;

        int max1=0;
        int max2=0;
        

        for(int i=0;i<n;i++){

         if(max1<arr[i]){
                max1=arr[i];        
               
            }
        } 

        for(int i=0;i<n;i++){

            if(max2<arr[i] && arr[i]!=max1){
                   max2=arr[i];        
                  
               }
           }

           System.out.println(max1+max2);

    }
    
}
