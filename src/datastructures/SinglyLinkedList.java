package datastructures;

public class SinglyLinkedList {
    Node head = null;
    Node tail = null;

    public SinglyLinkedList(int val) {
        Node node = new Node(val);
        head = node;
        tail = node;
    }

    public void insertAtFront(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void insertAtEnd(int val){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next= node;
        tail = node;
    }

    public void insertAfter(int val, int prevVal){
        Node temp = head;
        while(temp!=null && temp.val!=prevVal){
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        if (node.next ==null){
            tail = node;
        }
    }

    public void printValues(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public Node searchNodeWithValue(int val){
        Node temp =head;
        while(temp!=null){
            if(temp.val==val)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public int removeAtFront(){
        Node newHead = head.next;
        int val = head.val;
        head =null;
        head =newHead;
        return val;
    }

    public int removeAtEnd(){
        Node temp = head;
        Node prev = null;
        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        int val = temp.val;
        temp = null;
        tail = prev;
        return val;
    }

    public int removeNodeWithValue(int val){
        Node temp = head;
        Node prev = null;
        int ch = 0;
        if(temp.val==val){
            head = temp.next;
            val = temp.val;
            temp =null;
        }
        else {
            while (temp != null) {
                if (temp.val != val) {
                    prev = temp;
                    temp = temp.next;
                } else {
                    ch=1;
                    break;
                }
            }
            if(ch==0)
                return -1;
            prev.next = temp.next;
            val = temp.val;
            temp = null;
            if(prev.next==null){
                tail = prev;
            }
        }
        return val;
    }

}
