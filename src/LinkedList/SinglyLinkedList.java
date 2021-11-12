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
    public static void insertLast(int data){
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
}
