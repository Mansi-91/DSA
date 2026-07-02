package LinkedList;

public class Add1ToLL {
    public static Node addOne(Node head){
        head = ReverseLL.reverseLL(head);
        Node temp = head;
        Node prev = null;
        int carry = 1;
        while(temp != null && carry >0){
            int sum = carry + temp.data;
            temp.data = sum % 10;
            carry = sum / 10;
            prev = temp;
            temp = temp.next;     
        }
        if(carry > 0){
            Node newNode = new Node(carry);
            prev.next = newNode;
        }
        head = ReverseLL.reverseLL(head);
        return head;
    }
    public static void main(String[] args){
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        LinkedListUtils.printLL(head);
        head = addOne(head);
        LinkedListUtils.printLL(head);

    }
}
