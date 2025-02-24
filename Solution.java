import java.util.Scanner;

class Node{
    int value;
    Node left,right;
    Node(int value){
        this.value= value;
    }
}

class BinaryTree{
    Node root;
    BinaryTree(){
        root = null;
    }
    void populate(Scanner scanner){
        System.out.println("Enter the root node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);

    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("do you want to ent`er the left value of " + node.value);
        boolean res = scanner.nextBoolean();
        if(res){
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("do you want to enter the right value of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }

    }
    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }


}


public class Solution {
    public static void main(String[] args) {
        System.out.println("The Binary tree is");
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();

    }


}
