public class swappingnodes {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    static int countall(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    static void swappingnodes1(Node head, int k) {
        Node start = head;
        int count = 1;
        while (count != k) {
            count++;
            start = start.next;
        }
        // now start pointing starting k

        Node end = head;
        int countall = countall(head);
        int target = (countall - k) + 1;
        int currcount = 1;
        while (currcount != target) {
            currcount++;
            end = end.next;
        }

        // now end pointing last kth index

        int startdata = start.data;
        int enddata = end.data;
        start.data = enddata;
        end.data = startdata;
    }

    static void printlist(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printlist(head);
        System.out.println("after swapping list");

        swappingnodes1(head, 2);

        printlist(head);

    }

}
