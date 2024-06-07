public class linkedlistpractise {
    class Node{
        int data;
        Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    }

    // starting point of the node
    Node Head;

    // InsertAtThebegainning
    void InsertAtThebegainning(int data){
        Node newNode=new Node(data);
        newNode.next=Head;
        Head=newNode;
    }
    // InsertAtTheLast
      void InsertAtTheLast(int data){
        Node newNode=new Node(data);
        if(Head==null){
            Head=newNode;
            return;
        }

        Node last = Head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;

      }
   void InsertAfter(Node prenode,int data){
    if(prenode==null){
        System.out.println("not a present list");
        return;
    }

    Node newNode=new Node(data);
    newNode.next=prenode.next;
    prenode.next=newNode;
   }
       void printData(){
        Node newNode=Head;
         
        while(newNode!=null){
        
            System.out.print(newNode.data + "--> ");
            newNode=newNode.next;
        }
        

    }
    public static void main(String[] args) {
        linkedlistpractise obj=new linkedlistpractise();
        obj.InsertAtThebegainning(20);
        obj.InsertAtThebegainning(30);
        obj.InsertAtThebegainning(40);
        obj.InsertAtTheLast(100);
        obj.InsertAtTheLast(90);
        obj.InsertAtTheLast(80);
        Node n1=obj.Head.next;
        obj.InsertAfter(n1, 50);
        obj.printData();

        
    }
    
}
