package Stack;


class Stack{
    int top ;
    int size ;
    int[] data;

    Stack(){
        this(10);
    }
    Stack(int size ){
        top = -1;
        this.size = size;
        this.data = new int[size];
    }
    public void insert(int val){
        if(top == size -1){
            System.out.println("stack overflow");
            return;
        }
        data[++top] = val;

    }
    public void Display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        return data[top--];
    }
}
public class Implementation {

    public static void main(String[] args) {
        Stack stacki = new Stack(5);
        stacki.insert(1);
        stacki.insert(2);
        stacki.insert(3);
        stacki.insert(4);
        stacki.insert(5);
        stacki.Display();
        System.out.println("poped"+ stacki.pop());
        System.out.println("poped"+ stacki.pop());
    }
}
