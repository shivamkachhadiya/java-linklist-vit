class ReverseList{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	static void printlist(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	static Node reverselist(Node head){
		Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;   // store next node
            curr.next = prev;   // reverse the link
            prev = curr;        // move prev forward
            curr = next;        // move curr forward
        }
        return prev; // new head
    }
	
	public static void main(String[]args){
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		
		System.out.println("Original list:");
        printlist(head);

        // Reverse
        head = reverselist(head);

        System.out.println("Reversed list:");
        printlist(head);
	}
	
}