import java.util.*;
public class hashtable {
    public static void main(String[] args) {
        Hashtable <Integer,String>ht=new Hashtable<>();
        ht.put(1,"jayesh");
        ht.put(2,"prashant");
        ht.put(3,"tejas");
        ht.put(4,"vishal");
        ht.put(5,"sid");

        // System.out.println(ht);
        // System.out.println(ht.get("jayesh"));
        // System.out.println(ht.remove(5));
        // System.out.println(ht);
        // System.out.println(ht.containsKey(3));
        // System.out.println(ht.containsValue("jayesh"));
        // System.out.println(ht.keySet());
        // System.out.println(ht.values()); 

        int arr[]={2,12,44,122,98,88};

        for(int i : arr){
          System.out.println(i);
        }
    }
    
}
