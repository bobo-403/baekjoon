import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Node {
    int data;
    Node left_child;
    Node right_child;

    Node() {
    }

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node left_child, Node right_child) {
        this.data = data;
        this.left_child = left_child;
        this.right_child = right_child;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int data;
        Node root = null;

        try {
            while ((input = br.readLine()) != null && !input.isEmpty()) {
                data = Integer.parseInt(input);
                Node new_node = new Node(data, null, null);
                if (root == null) {
                    root = new_node;
                    continue;
                }
                append(root, new_node);

            }
        } catch (IOException e) {

        }
        postorder(root);
    }

    static void append(Node ptr, Node new_node) {
        if (new_node.data < ptr.data) {
            if (ptr.left_child == null) {
                ptr.left_child = new_node;
                return;
            }
            append(ptr.left_child, new_node);
        } else {
            if (ptr.right_child == null) {
                ptr.right_child = new_node;
                return;
            }
            append(ptr.right_child, new_node);
        }
    }

    static void postorder(Node ptr) {
        if (ptr != null) {
            postorder(ptr.left_child);
            postorder(ptr.right_child);
            System.out.println(ptr.data);
        }
    }

}
