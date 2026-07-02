package LinkedList;
//Recusive:  TC=O(nlogn) SC = O(logn)
public class SortLL {
    public static Node sortLL(Node head){
        if(head == null || head.next == null) return head;
        Node mid = midNode(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = sortLL(head);
        Node newRight = sortLL(rightHead);
        return merge(newLeft, newRight); 
    }
    public static Node midNode(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
            if (head1.data <= head2.data){
                temp.next= head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if(head1 != null){
            temp.next= head1;
        }
        if(head2 != null){
            temp.next= head2;
        }
        return mergedLL.next;
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(2);
        head.next.next = new Node(7);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);
        LinkedListUtils.printLL(head);
        LinkedListUtils.printLL(sortLL(head));
    }
}
