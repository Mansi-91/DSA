package LinkedList;

public class AddTwoNumbers {
    public static Node addTwoNumbers(Node n1, Node n2){
        Node temp = new Node(-1);
        Node head = temp;
        int carry = 0;
        while(n1 != null || n2 != null || carry != 0){
            int sum = carry;
            if(n1!=null){
                sum += n1.data;
                n1 = n1.next;
            }
            if(n2!=null){
                sum += n2.data;
                n2 = n2.next;
            }
            Node newNode = new Node(sum % 10);
            carry = sum/10;
            temp.next = newNode;
            temp = newNode;
        }
        return head.next;
    }
    public static void main(String[] args){
        Node n1 = new Node(1);
        n1.next = new Node(5);
        n1.next.next = new Node(6);
        Node n2 = new Node(9);
        n2.next = new Node(1);
        n2.next.next = new Node(3);
        n2.next.next.next = new Node(4);
        LinkedListUtils.printLL(n1);
        LinkedListUtils.printLL(n2);
        System.out.println("Summision of lists");
        Node head = addTwoNumbers(n1, n2);
        LinkedListUtils.printLL(head);


    }
}
