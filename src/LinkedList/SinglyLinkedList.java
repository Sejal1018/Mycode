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
    public static void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        while(head.next!=null){
            head=head.next;
        }
        head.next=newNode;
    }
}
