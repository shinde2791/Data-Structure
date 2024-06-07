public class stringpractise {
    public static void main(String [] args){
        String str1="UpGrad Learning center for Pune location";
        String s1="jayesh";
        String s2="jayesh";


        // to find the lenght of string 
        int len=str1.length();
        System.out.println(len);

        // to find the index of some character
        int indexL=str1.indexOf('c');
        System.out.println(indexL);

        // to convert the sentence in upper and lower case
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        // substring

        String str2=str1.substring(3, 16);
        System.out.println(str2);

        //concat string
        String s3=s1+s2;
        System.out.println("concat 1st way "+ s3);
        System.out.println("concat 2nd way "+ s1.concat(s2));

        // compare string 
        System.out.println("compare 1st method "+ s1.compareTo(s2));
        System.out.println("compare 2nd method "+ s1.equals(s2));

        //trim -trim helps to remove a large space from the declare string
        String S3="                hello";
        System.out.println(S3.trim());


        // replace some char with other char
        System.out.println(s1.replace('a', 't'));

        //split
        String [] newStr=str1.split("a");
        System.out.println(newStr[1]); 

        // start with
        System.out.println(str1.startsWith("U"));

        // ends with
        System.out.println(str1.endsWith("g"));

        //to check whether a string is empty 
        System.out.println(str1.isEmpty());
        

     }
}
