class ReverseLl
{
	private Node head;
	
	static class Node
	{
	   private int data;
	   private Node next;
	

	public Node(int data)
	{
		this.data = data;
	}

	}

	public ReverseLl(Node head)
	{
		this.head = head;
	}

	public void add(Node node)
	{
		Node current = head;

		while(current != null)
		{
			if(current.next == null)
			{
				current.next = node;
				break;
			}

			current = current.next;
		}
	}

	public void display()
	{
		Node node = head;

		while(node != null)
		{
			System.out.print(node.data+" ");

			node = node.next;
		}

		System.out.println();
	}

	public void reverse()
	{
		Node pointer = head;

		Node previous = null;

		Node current = null;

		while(pointer != null)
		{
			current = pointer;
			
			pointer = pointer.next;

			current.next = previous;

			previous = current;

			head = current;
		}
	}

	public static void main(String args[])
	{

		Node head = new ReverseLl.Node(1);
		ReverseLl r = new ReverseLl(head);

		r.add(new ReverseLl.Node(2));
		r.add(new ReverseLl.Node(3));
		r.add(new ReverseLl.Node(4));
		r.add(new ReverseLl.Node(5));

		r.display();
		r.reverse();
		r.display();

		Node head1 = new ReverseLl.Node(3);
		ReverseLl r1 = new ReverseLl(head1);

		r1.add(new ReverseLl.Node(4));
		r1.add(new ReverseLl.Node(2));
		r1.add(new ReverseLl.Node(5));

		r1.display();
		r1.reverse();
		r1.display();
	}
}




		
		
			
