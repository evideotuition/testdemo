
public class MyLinkedList {
	
	Node Head;

	public void add(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (Head==null)
		{
			Head = node;
		
		}
		else
		{
			Node n = Head;
			while(n.next!=null)
			{
				n = n.next;
				
			}
			n.next = node;
		}
	
	}

	public void show()
	{
		Node n = Head;
		while(n.next!=null)
		{
			System.out.println(n.data);
			n = n.next;
			
		}
		System.out.println(n.data);
	}
}
