package LinkedList;

public class PalindromeLL {
    public static boolean isPalindrome(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        Node mid = slow;
        Node left = head;
        Node right = ReverseLL.reverseLL(mid.next);
        while(right != null ){
            if (left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args){
        LinkedListUtils.addLast(1);
        LinkedListUtils.addLast(2);
        LinkedListUtils.addLast(3);
        LinkedListUtils.addLast(3);
        LinkedListUtils.addLast(2);
        LinkedListUtils.addLast(1);
        System.out.println(isPalindrome(LinkedListUtils.head));
        
    }
}
