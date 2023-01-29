package datastructures;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList(5);
        Node head = sll.head;
        Node tail = sll.tail;
        System.out.println("After Creation initially head contains " + head.val + ",tail contains  " + tail.val);
        sll.insertAtFront(7);
        sll.insertAtEnd(6);
        sll.insertAfter(10,7);
        sll.printValues();
        head = sll.head;
        tail = sll.tail;
        System.out.println("\nCurrently head contains " + head.val + ",tail contains  " + tail.val);
        Node findNode = sll.searchNodeWithValue(7);
        if (findNode!=null){
            System.out.println("Node Found: "+findNode.toString());
        }
        else{
            System.out.println("Node not Found");
        }
        int removedVal = sll.removeAtFront();
        System.out.println(removedVal+" removed");
        sll.printValues();
        removedVal = sll.removeAtEnd();
        System.out.println(removedVal+" removed");
        sll.printValues();
        sll.insertAtEnd(25);
        removedVal = sll.removeNodeWithValue(5);
        System.out.println(removedVal+" removed");
        sll.printValues();
        removedVal = sll.removeNodeWithValue(5);
        System.out.println(removedVal+" removed");
        sll.printValues();
        head = sll.head;
        tail = sll.tail;
        System.out.println("\nCurrently head contains " + head.val + ",tail contains  " + tail.val);
    }
}
