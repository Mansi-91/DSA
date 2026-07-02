package LinkedList;

public class IntersectionOfLL {
    public static Node intersectionOfLL(Node n1, Node n2){
        Node temp1 = n1;
        Node temp2 = n2;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : n2;
            temp2 = (temp2 != null) ? temp2.next : n1;
        }
        return temp1;
    }
    public static void main(String[] args){
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(6);
        n1.next.next.next.next = new Node(7);
        Node n2 = new Node(4);
        n2.next = new Node(5);
        Node ans = intersectionOfLL(n1, n2);
        if(ans != null) System.out.println(ans.data);
        else System.out.println("No intersection");

    }
}
