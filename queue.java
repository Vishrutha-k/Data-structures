class queue
{
    int front,rear;
    int[] queue1;
    void create_queue(int n)
    {
        queue1=new int[n];
        front=-1;
        rear=-1;
    }
    void enqueue(int n)
    {
        if(rear==queue1.length-1)
        {
            System.out.println("Queue is full");
        }
        else{
            front=0;
            rear++;
            queue1[rear]=n;
            System.out.println(n+" "+"successfully inserted");
        }
    }
    String dequeue()
    {
        if(front==-1)
        {
            System.out.println("Queue is already empty");
        }
        int k=queue1[front];
        front++;
        String s="The queue"+k+"Successfully dequeued";
        return s;
        
    }
    void display()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.println(queue1[i]);
        }
    }
}
public class sample
{
    public static void main(String[] args)
    {
        queue q=new queue();
        q.create_queue(4);
        q.enqueue(2);
        q.enqueue(2);
        String m=q.dequeue();
        System.out.println(m);
        q.display();
    }
}
