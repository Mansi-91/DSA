package LinkedList;

public class LengthOfCycle {
    public static int lengthOfCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){ 
                fast = fast.next; 
                int count = 1;
                while(slow != fast){
                    fast = fast.next;
                    count++;
                }
                return count;  
            }         
        }
        return 0;
    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;
        System.out.println(lengthOfCycle(head));
    }
}
