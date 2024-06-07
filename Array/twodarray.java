public class twodarray {
    public static void main(String[] args) {
        int N=8,M=7;
        int[][] arr = new int[N][M];

// to give value
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=j;
            }
        }
// to print value
int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                  if(arr[i][j]%2==0){
                    System.out.println(arr[i][j]);
                  }       
            }
            System.out.println();
        }
System.out.println(sum);
    }

}
