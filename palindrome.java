import java.util.Stack;

class palindrome {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static int checkpalindrome(Node head) {
		Node start = head;
		int ans = 1;
		Stack<Integer> s = new Stack<>();
		Node tail = head;
		while (tail != null) {
			s.push(tail.data);
			tail = tail.next;
		}

		while (start != null) {
			if (start.data != s.peek()) {
				ans = 0;
				break;
			}
			start = start.next;
			s.pop();
		}
		return ans;
	}

	public static void main(String[] args) {
		Node head1 = new Node(1);
		head1.next = new Node(3);
		head1.next.next = new Node(5);
		head1.next.next.next = new Node(993);
		head1.next.next.next.next = new Node(1);

		int validate = checkpalindrome(head1);
		if (validate == 1) {
			System.out.println("list is palindrome");
		} else {
			System.out.println("list is not an palindrome");
		}

	}
}