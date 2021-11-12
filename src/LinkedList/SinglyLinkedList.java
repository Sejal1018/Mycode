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
    // to add the node at the beginning.
    public static void insertBeginning(int data){
       Node newNode =new Node(data);
        if(head==null){
            head=newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void main(String[] args) {
        Node firstNode = new Node(4);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(6);
        firstNode.next=secondNode;
        secondNode.next=thirdNode;

    }
}
