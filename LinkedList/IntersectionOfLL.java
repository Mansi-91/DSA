package LinkedList;

public class IntersectionOfLL {
    public static int intersectionOfLL(Node n1, Node n2){
        Node temp1 = n1;
        Node temp2 = n2;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : n2;
            temp2 = (temp2 != null) ? temp2.next : n1;
        }
        return (temp1 == null) ? -1 : temp1.data;
    }
    public static void main(String[] args){
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(6);
        n1.next.next.next.next = new Node(7);
        Node n2 = new Node(4);
        n2.next = new Node(5);
        
        System.out.println(intersectionOfLL(n1, n2));

    }
}
