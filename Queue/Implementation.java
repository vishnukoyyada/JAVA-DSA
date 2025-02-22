package Queue;

class Queue {
    int[] data;
    int front, size;

    Queue() {
        this(5);
    }

    Queue(int size) {
        this.size = size;
        this.data = new int[size];
        this.front = 0;
    }

    public void enqueue(int val) {
        if (front == size) { // Check for overflow
            System.out.println("Overflow");
            return;
        }
        data[front] = val;
        front++;
    }

    public int dequeue() {
        if (front == 0) { // Check for underflow
            System.out.println("Underflow");
            return -1;
        }
        int temp = data[0];

        // Shift elements to the left
        for (int i = 1; i < front; i++) {
            data[i - 1] = data[i];
        }
        front--; // Reduce front index after shifting

        return temp;
    }

    public void display() {
        if (front == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < front; i++) {
            System.out.print(data[i] + " ");
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
        queue.enqueue(50);

        queue.display(); // Expected: 10 20 30 40 50

        queue.dequeue();
        queue.display(); // Expected: 20 30 40 50

        queue.dequeue();
        queue.display(); // Expected: 30 40 50
    }
}
