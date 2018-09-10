package Stack;

public class Stack {
	
	int cap = 5;
	int top=0;
	int stack[] = new int[cap];

	
	public void push(int data)
	{
		
		if ((top) == cap)
		{
			System.out.println("Stack is full");
		}
		else
		{
			stack[top] = data;
			top++;
		}
	}
	
	public void pop()
	{
		if (top<=0)
		{
			System.out.println("Stack is full");
		}
		else
		{
			int data;
			data = stack[top-1];
			stack[top-1] = 0;
			top--;
			
			System.out.println("Deleted data is  "+ data);
			
		}
	
	}
	
	public void show()
	{
		for (int n: stack)
		{
			System.out.println(n);
		}
	}
}
