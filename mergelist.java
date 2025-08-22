class mergelist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node mergeListAll(Node head1, Node head2) {
        Node dummy = new Node(0); // temporary start
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

        // attach remaining nodes
        if (temp1 != null) {
            tail.next = temp1;
        } else {
            tail.next = temp2;
        }

        return dummy.next; // skip dummy node
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        System.out.println("Original list 1:");
        printList(head1);

        System.out.println("Original list 2:");
        printList(head2);

        Node merged = mergeListAll(head1, head2);
        System.out.println("Merged list:");
        printList(merged);
    }
}
