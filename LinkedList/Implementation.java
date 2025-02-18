package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;  // Fix: Initialize next as null
    }
}

class LL {
    Node head;

    public void insert(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public void insertFirst(int val){
        Node newnode = new Node(val);
        newnode.next = head;
        head= newnode;
    }
    public void Delete(int val){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If the head node itself holds the key to be deleted
        if (head.data == val) {
            head = head.next;
            return;
        }
        Node prev = null;
        Node temp = head;
        while(temp != null && temp.data != val){
            prev= temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Implementation {
    public static void main(String[] args) {
        LL link = new LL();
        link.insert(1);
        link.insert(2);
        link.insert(3);
        link.insert(4);
        link.insert(5);
        link.insertFirst(0);
        link.insertFirst(-1);
        link.Delete(4);

        link.display();
    }
}