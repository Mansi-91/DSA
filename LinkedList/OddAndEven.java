package LinkedList;

public class OddAndEven {
    public static Node segregateOddEven(Node head){
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void main(String[] args){
        LinkedListUtils.addLast(1);
        LinkedListUtils.addLast(2);
        LinkedListUtils.addLast(1);
        LinkedListUtils.addLast(2);
        LinkedListUtils.addLast(1);
        LinkedListUtils.addLast(2);
        segregateOddEven(LinkedListUtils.head);
        LinkedListUtils.printLL(LinkedListUtils.head);
        
    }
}
