package Queue;

public class Queue {
	
	int cap=5;
	int front=0;
	int rear=0;
	int queue[] = new int[cap];
	
	public void enqueue(int data)
	{
		if (rear>=cap)
		{
			System.out.println("Queue is full");
		}
		else
		{
			queue[rear] = data;
			rear++;
		}
	}
	
	public void dequeue()
	{
		if (front >= cap)
		{
			System.out.println("Queue is empty!");
		}
		else
		{
			int data = queue[front];
			queue[front] = 0;
			front++;
			System.out.println(data);
		}

	}
	
	public void show()
	{
		for (int n : queue)
		{
		
				System.out.println("value is " +n);
		}
	}
}
