public class Recursionfact {
    void Factorical(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Recursionfact fact=new Recursionfact();
        fact.Factorical(5);
    }
    
}
