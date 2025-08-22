import java.util.*;

public class palindronell {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static int checkpalidrone(Node head) {
        int ans = 1;
        Node temp = head;

        Stack<Integer> s = new Stack<>();
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if (temp.data != s.peek()) {
                ans = 0;
                break;
            } else {
                temp = temp.next;
                s.pop();
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(6);
        head.next.next = new Node(3);
        head.next.next.next = new Node(60);
        head.next.next.next.next = new Node(5);

        int ans = checkpalidrone(head);

        if (ans == 1) {
            System.out.println("link list is palindrone...");
        } else {
            System.out.println("link list is not an palindrone...");
        }
    }

}
