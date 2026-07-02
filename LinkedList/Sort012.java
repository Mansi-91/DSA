package LinkedList;

public class Sort012 {
    public static Node sort012(Node head){
       
        Node head0 = new Node(-1);
        Node head1 = new Node(-1);
        Node head2 = new Node(-1);
        Node temp0 = head0;
        Node temp1 = head1;
        Node temp2 = head2;
        Node temp = head;
        while(temp != null){
            if (temp.data ==0){
                temp0.next = temp;
                temp0 = temp;
            }
            else if (temp.data ==1){
                temp1.next = temp;
                temp1 = temp;
            }
            else{
                temp2.next = temp;
                temp2 = temp;
            }
            temp = temp.next;
        }
        temp0.next=(head1.next != null) ? head1.next: head2.next;
        temp1.next= head2.next;
        temp2.next = null;
        return head0.next;
    }
    public static void main(String[] args){
        LinkedListUtils.addLast(1);
        LinkedListUtils.addLast(2);
        LinkedListUtils.addLast(0);
        LinkedListUtils.addLast(1);
        LinkedListUtils.addLast(0);
        LinkedListUtils.addLast(1);
        Node head = LinkedListUtils.head;
        LinkedListUtils.printLL(head);
        LinkedListUtils.printLL(sort012(head));
    }
}
