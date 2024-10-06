class Node {
    int data;
    Node next;


    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    // Add a node at the end of the list
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    // Add a node at the beginning of the list
    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    // Delete a node with a specific value
    public void deleteWithValue(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // Print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // // Append nodes
        list.append(1);
        list.append(2);
        // list.append(3);
        
        // Print the list
        list.printList(); // Output: 1 -> 2 -> 3 -> null
        
        // Prepend a node
        list.prepend(0);
        
        // Print the list
        list.printList(); // Output: 0 -> 1 -> 2 -> 3 -> null
        
        // Delete a node
        list.deleteWithValue(2);
        
        // Print the list
        list.printList(); // Output: 0 -> 1 -> 3 -> null
    }
}
