package LinkedList;

public class DeleteNode {
    public static void deleteNode(Node node){
        if(node == null || node.next == null){
            System.out.println("null");
            return;
        }
        node.data = node.next.data;
        node.next = node.next.next;   
    }
    public static void main(String[] args){
        LinkedListUtils.addLast(1);
        LinkedListUtils.addLast(2);
        LinkedListUtils.addLast(3);
        LinkedListUtils.addLast(3);
        LinkedListUtils.addLast(2);
        LinkedListUtils.addLast(1);
        Node node = LinkedListUtils.head;
        deleteNode(node);
        LinkedListUtils.printLL(LinkedListUtils.head);
        
    }
}
