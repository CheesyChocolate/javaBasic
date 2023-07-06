public class Queue {
	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	private int count;

	Queue(int size) {
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	public int size() {
		return count;
	}

	public Boolean isEmpty() {
		return (size() == 0);
	}

	public Boolean isFull() {
		return (size() == capacity);
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		return arr[front];
	}

	public void insert(int item) {
		if (isFull()) {
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		}
		//System.out.println("Inserting " + item);
		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}

	public int remove() {
		if (isEmpty()) {
			System.out.println("UnderFlow \nProgram Terminated");
			System.exit(1);
		}
		//System.out.println("Removing " + peek());
		front = (front + 1) % capacity;
		count--;
		return arr[front];
	}

	public void printQueue(Queue q) {
		int x;
		Queue backup = new Queue(q.size());
		while (!q.isEmpty()) {
			x = q.remove();
			System.out.println(x);
			backup.insert(x);
		}
		while (!backup.isEmpty()) {
			q.insert(backup.remove());
		}
	}
	/** write a function that returns the sum of elements of queue between
	  * m and n rows. */
	public static int partialsum(Queue q, int m, int n) {
		int sum = 0;
		int tmp, i = 0,x;
		if (m > n) {
			tmp =m;
			m = n;
			n = tmp;
		}
		while (!q.isEmpty() && i < n) {
			x = q.remove();
			if (i >= m) {
				sum += x;
			}
			q.insert(x);
			i++;
		}
		return sum;
	}

	/** write a function that rempves all k-valued elements from a queue and
	  * assign them to end of the queue.
	  * example: q = [2,5,1,5,3,8,5,4,7] and k = 5 it becomes [2,1,3,8,4,7,5,5,5] */
	public static Queue queueOeder(Queue q, int k) {
		Queue backup = new Queue(q.size());
		int i = 0, x;
		while (!q.isEmpty()) {
			x = q.remove();
			if (x != k) {
				backup.insert(x);
			}
			else {
				i++;
			}
		}
		while (i > 0) {
			backup.insert(k);
			i--;
		}
		return backup;
	}


	public static void main(String[] args) {
		Queue q = new Queue(5);
		Queue q2 = new Queue(1);
		q.insert(5);
		q.insert(5);
		q.insert(3);
		q.insert(5);
		q.insert(4);
		q2.printQueue(q);
	}
}
