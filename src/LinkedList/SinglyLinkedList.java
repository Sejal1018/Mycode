package LinkedList;

public class SinglyLinkedList {
    static Node head;
    //Node creation
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // to add the node at the last.
    public  void insertLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
       Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    // to add the node at the beginning.
    public  void insertBeginning(int data){
       Node newNode =new Node(data);
        if(head==null){
            head=newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void Searching(int data){
        if(head==null){
            return;
        }
        Node temp=head;
        boolean result=false;
        while(temp!=null){
            if (temp.data==data) {
                result=true;
                break;
            }
            temp=temp.next;
        }
        if (result==true) {
            System.out.println(" Found");
        }else{
            System.out.println("NOt Found");
        }
    }
    public void dispaly(){
        if(head==null){
            System.out.println("null");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertBeginning(4);
        sll.insertLast(5);
        sll.insertLast(6);
        /*
        Node firstNode = new Node(4);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(6);
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
         */
        sll.dispaly();
        sll.Searching(7);
    }
}
