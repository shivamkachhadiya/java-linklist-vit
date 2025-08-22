
public class mergelist1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node mergelist(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                tail.next = temp1;
                temp1 = temp1.next;
            } else {
                tail.next = temp2;
                temp2 = temp2.next;
            }
            tail = tail.next;
        }

        if (temp1 != null) {
            tail.next = temp1;
        } else {
            tail.next = temp2;
        }

        return dummy.next;
    }

    static void printlist(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head1 = new Node(55);
        head1.next = new Node(77);
        head1.next.next = new Node(99);

        Node head2 = new Node(66);
        head2.next = new Node(88);
        head2.next.next = new Node(102);
        head2.next.next.next = new Node(999);

        Node list = mergelist(head1, head2);
        printlist(list);

    }

}
