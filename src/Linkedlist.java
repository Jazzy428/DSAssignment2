public class Linkedlist {

    // Node class to define each node in the linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the linked list

    // Method to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // New node points to the current head
        head = newNode; // Update head to the new node
    }

    // Method to insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode; // Add the new node at the end
    }

    // Method to delete a node from the beginning
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        head = head.next; // Move head to the next node
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method for testing
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        // Insert at the beginning
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display(); // Output: 30 -> 20 -> 10 -> NULL

        // Insert at the end
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.display(); // Output: 30 -> 20 -> 10 -> 40 -> 50 -> NULL

        // Delete from beginning
        list.deleteFromBeginning();
        list.display(); // Output: 20 -> 10 -> 40 -> 50 -> NULL
    }
}
