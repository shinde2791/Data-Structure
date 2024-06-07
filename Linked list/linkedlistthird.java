// write a program to search an element in linked list and also find the lenght in linked list
public class linkedlistthird {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    // insert at the begainning

    void InsertAtThebegainning(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }

    void InsertAtTheLast (int data){ // Insert an element in last
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newnode;
    }
    // finding the lenght of linkedlist
    int linkedlenght(){
        Node last=head;
        int count=0;
        while(last!=null){
            count++;
            last=last.next;
        }
        return count;
    }

    boolean Search(Node headnode,int searchdata){ // search an element in linkedlist
        Node current=headnode;
        while(current!=null){
            if(current.data==searchdata){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    void printdetail(){
        Node newnode=head;
        while(newnode!=null){
            System.out.println(newnode.data);
            newnode=newnode.next;
        }
    }

    public static void main(String[] args) {
        linkedlistthird obj=new linkedlistthird();
        obj.InsertAtThebegainning(30);
        obj.InsertAtThebegainning(40);
        obj.InsertAtThebegainning(50);
        obj.InsertAtTheLast(3);
        
        obj.printdetail();

        int len=obj.linkedlenght();
        System.out.println("length"+ len);

        boolean result=obj.Search(obj.head, 40);
        System.out.println(result);
        if(result==true){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }

    
}
 