package LinkedList;

public class DeleteMiddleNode {
    public static Node deleteMiddleNode(Node head) {
        Node mid = MiddleOfLL.middleOfLL(head);
        Node temp = head;
        while (temp.next != mid) {
            temp = temp.next;
        }
        temp.next = mid.next;
        return mid;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node deleted = deleteMiddleNode(head);
        LinkedListUtils.printLL(head);
        System.out.println("Deleted Node = " + deleted.data);
    }
}
