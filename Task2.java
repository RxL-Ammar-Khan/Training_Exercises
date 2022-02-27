class Queue
{
    private int[] arr;      
    private int front;      
    private int rear;       
    private int capacity;   
    private int count;      
    
    Queue(int size)
    {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
 
    public int Remove()
    {
        // check for queue underflow
        if (isEmpty())
        {
            System.out.println("Underflow\n");
            System.exit(-1);
        }
 
        int x = arr[front];
 
        System.out.println("Removing " + x);
 
        front = (front + 1) % capacity;
        count--;
 
        return x;
    }
 
    public void Add(int item)
    {
        // check for queue overflow
        if (isFull())
        {
            System.out.println("Overflow");
            System.exit(-1);
        }
 
        System.out.println("Inserting " + item);
 
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }
     public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\n");
            System.exit(-1);
        }
        return arr[front];
    }
 
    public int size() {
        return count;
    }
 
    public boolean isEmpty() {
        return (size() == 0);
    }
 
    public boolean isFull() {
        return (size() == capacity);
    }
}
 
class Main
{
    public static void main (String[] args)
    {
        // create a queue of capacity 5
        Queue q = new Queue(5);
 
        q.Add(1);
        q.Add(2);
        q.Add(3);
 
        System.out.println("The front element is " + q.peek());
        q.Remove();
        System.out.println("The front element is " + q.peek());
 
        System.out.println("The queue size is " + q.size());
 
        q.Remove();
        q.Remove();
 
        if (q.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }
}
