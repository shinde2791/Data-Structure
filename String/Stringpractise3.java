//write a program to find a duplicate element in a string

public class Stringpractise3 {
    public static void main(String[] args) {
        String org="soonooothingswillbefine";
        //String duplicate="";
        int len=org.length();
       int count=0;
        for(int i=0;i<=len-1;i++){
            count=0;
            for(int j=i+1;j<len-1;j++){
                
               if(org.charAt(i)==org.charAt(j)){
                    count++;
                    if(count==1){
                    System.out.println(org.charAt(i));
                    
                    break;
                    }
                }
                
            }
        }
    }
    
}
