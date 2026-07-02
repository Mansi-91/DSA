package LinkedList;

public class RemoveNthNode {
    public static Node removeNthNode(Node head, int n){
        int size = LinkedListUtils.sizeOfLL(head);
        Node temp = head;
        if (n == size) return head.next; 
        for(int i = 0; i < size-n-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public static void main(String[] args){
        LinkedListUtils.addLast(1);
        LinkedListUtils.addLast(2);
        LinkedListUtils.addLast(3);
        LinkedListUtils.addLast(4);
        LinkedListUtils.addLast(5);
        LinkedListUtils.addLast(6);
        Node head = LinkedListUtils.head;
        LinkedListUtils.printLL(head);
        removeNthNode(head, 2);
        LinkedListUtils.printLL(head);
        
    }
}
