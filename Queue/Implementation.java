package Queue;


class Queue{
    int[] data;
    int front,rear,size;
    Queue(){
        this(5);
    }
    Queue(int size){
        this.size = size;
         this.data = new int[size];
       this.rear = -1;
       this.front = 0;
    }
    public void enqueue(int val){
        if(rear == size-1){
            System.out.println("overflow");
        }
        rear = (rear +1)%size;
        data[rear] = val;

    }
    public int  dequeue(){
        if(front > rear){
            System.out.println("underflow");
            return -1;
        }
        return data[front--];
    }
    public void display(){
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(data[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}
public class Implementation {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(60);

        queue.display(); // Expected: 10 20 30 40 50

        System.out.println("Dequeued: " + queue.dequeue()); // Expected: 10// Expected: 20

        queue.display();
    }
}
