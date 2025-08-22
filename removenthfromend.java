public class removenthfromend {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static int countnodes(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count = count + 1;
            temp = temp.next;
        }
        return count;
    }

    static void deletefromend(Node head, int k) {
        int count = countnodes(head);
        int target = (count - k) + 1;
        int curr = 1;
        Node temp = head;
        while (curr != target - 1) {
            curr++;
            temp = temp.next;
        }
        System.out.println("deleted node is" + temp.next.data);
        temp.next = temp.next.next;
    }

    static void printlist(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(3);
        head.next.next = new Node(9);
        head.next.next.next = new Node(77);
        head.next.next.next.next = new Node(99);
        int k = 3;

        deletefromend(head, k);

        System.out.println("after deleting kth node from end...");
        printlist(head);

    }

}
